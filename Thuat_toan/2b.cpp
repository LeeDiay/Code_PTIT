#include <stdio.h>
#include <string.h>

// Function to decrypt OTP cipher given the ciphertext and the key
void otp_decrypt(char* ciphertext, char* key, char* decrypted_text) {
    int i;
    for (i = 0; i < strlen(ciphertext); i++) {
        decrypted_text[i] = ciphertext[i] ^ key[i];
    }
    decrypted_text[i] = '\0'; // Null-terminate the decrypted text
}

// Function to check if a word matches the specified pattern
int matches_pattern(char* word, char* pattern) {
    int i;
    for (i = 0; i < strlen(pattern); i++) {
        if (pattern[i] != '*' && pattern[i] != word[i]) {
            return 0; // Pattern does not match the word
        }
    }
    return 1; // Pattern matches the word
}

// Function to check if a word is in the Vietnamese dictionary
int is_vietnamese_word(char* word) {
    char* vietnamese_dictionary[] = {
        "Khoa", "Khóa", "Khoe", "Khoé", "Khoá", "Kho?", "Kho?", "Khoai", "Khoái", "Khoài",
        // Add more Vietnamese words here corresponding to possible values of '*' in the pattern
        NULL // End of dictionary marker
    };
    
    int i = 0;
    while (vietnamese_dictionary[i] != NULL) {
        if (matches_pattern(vietnamese_dictionary[i], word)) {
            return 1; // Word matches the pattern
        }
        i++;
    }
    return 0; // Word not found in the dictionary
}

// Function to find and display a word matching a specific pattern in Vietnamese
void find_vietnamese_word(char* pattern) {
    char possible_word[6]; // Assuming the word length is 5
    char key = 'A';

    while (key <= 'Z') {
        int i;
        for (i = 0; i < strlen(pattern); i++) {
            if (pattern[i] == '*') {
                possible_word[i] = key;
            } else {
                possible_word[i] = pattern[i];
            }
        }
        possible_word[i] = '\0'; // Null-terminate the possible word

        if (is_vietnamese_word(possible_word)) {
            printf("Found word: %s\n", possible_word);
            return;
        }
        key++;
    }
    printf("No word found.\n");
}

int main() {
    // Given ciphertext
    char ciphertext[] = "UOOWO";
    // Given pattern
    char pattern[] = "K***U";

    // Find the Vietnamese word matching the pattern
    find_vietnamese_word(pattern);

    return 0;
}

