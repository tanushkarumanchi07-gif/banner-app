#include <iostream>
#include <map>
#include <vector>
using namespace std;

class CharacterPattern {
private:
    char character;
    vector<string> pattern;

public:
    // Constructor
    CharacterPattern(char c, vector<string> p) {
        character = c;
        pattern = p;
    }

    // Getter for pattern
    vector<string> getPattern() {
        return pattern;
    }

    char getCharacter() {
        return character;
    }

    // Static Inner Class
    class CharacterPatternMap {
    public:
        static map<char, CharacterPattern> createMap() {
            map<char, CharacterPattern> patternMap;

            patternMap['O'] = CharacterPattern('O', {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            });

            patternMap['P'] = CharacterPattern('P', {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            });

            patternMap['S'] = CharacterPattern('S', {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            });

            return patternMap;
        }
    };
};

int main() {

    string word = "OOPS";

    map<char, CharacterPattern> patterns =
        CharacterPattern::CharacterPatternMap::createMap();

    for (int row = 0; row < 5; row++) {
        for (char c : word) {
            vector<string> p = patterns[c].getPattern();
            cout << p[row] << "  ";
        }
        cout << endl;
    }

    return 0;
}
