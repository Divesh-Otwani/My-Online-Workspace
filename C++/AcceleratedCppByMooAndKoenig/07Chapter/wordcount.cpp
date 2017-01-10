#include <iostream>
#include <map>
using namespace std;


int main(){
	string s;
	map<string, int> counters;
	// store each word and an associated counter
	// read the input, keeping track of each word and how often we see it
	cout << "Enter words: " << endl;
	while (cin >> s)
		++counters[s];
		// counters[s] default initializes to 0
	//write the words and associated counts
	for (map<string, int>::const_iterator it = counters.begin();
			it != counters.end(); ++it) {
		cout << it->first << "\t" << it->second << endl;
	}
	return 0;
}




