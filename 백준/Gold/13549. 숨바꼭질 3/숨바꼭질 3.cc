#include<iostream>
#include<queue>
#include<deque>
#include<cstring>
#include<utility>
using namespace std;

#define MIN_X 0
#define MAX_X 100000
#define UNVISITED -1

int fastest_time[MAX_X + 1];

void bfs(int start, int end);
int abs(int n) { return ((n >= 0) ? n : -n); }

int main() {
    memset(fastest_time, UNVISITED, sizeof(fastest_time));
    int n, k;

    cin >> n >> k;
    bfs(n, k);
    cout << fastest_time[k] << "\n";
    
    return 0;
}

void bfs(int start, int end) {
    deque<pair<int, int>> moves; // moves.first: location, moves.second: moves
    pair<int, int> cursor;

    int location_flag[3];
    int checkpoint[3];
    int time_usage[] = {0, 1, 1};
    int i;

    bool possible;

    moves.push_back(make_pair(start, 0));
    fastest_time[start] = 0;

    while (!moves.empty()) {
        cursor = moves.front(); moves.pop_front();

        if(cursor.first == end) continue; // Reached the end
        else if((cursor.first - end) > (abs(end - start) - cursor.second)) continue; // Too many moves required to go back
        else if(fastest_time[end] != -1 && (fastest_time[end] <= cursor.second)) continue; // Unnecessary moves

        // if location_flag[i] >= 0 then this case is available for check.
        location_flag[0] = ((MAX_X / 2) - cursor.first);
        location_flag[1] = (cursor.first - (MIN_X + 1));
        location_flag[2] = ((MAX_X - 1) - cursor.first);

        checkpoint[0] = (cursor.first * 2);
        checkpoint[1] = (cursor.first - 1);
        checkpoint[2] = (cursor.first + 1);

        for(i = 0; i < 3; i ++) {
            if(location_flag[i] < 0) continue;

            possible = (fastest_time[checkpoint[i]] == UNVISITED)
                ? true
                : (fastest_time[checkpoint[i]] > (cursor.second + time_usage[i]))
            ;

            if(possible) {
                fastest_time[checkpoint[i]] = (cursor.second + time_usage[i]);
                moves.push_front(make_pair(checkpoint[i], (cursor.second + time_usage[i])));
            }
        }
    }
}