#include <stdio.h>
#include <string.h>

// Function to decrypt Caesar cipher given the ciphertext and the known key
void caesar_decrypt(char* ciphertext, int key) {
    int i;
    for (i = 0; i < strlen(ciphertext); i++) {
        // Decrypt uppercase letters
        if (ciphertext[i] >= 'A' && ciphertext[i] <= 'Z') {
            ciphertext[i] = ((ciphertext[i] - 'A' - key + 26) % 26) + 'A';
        }
        // Decrypt lowercase letters
        else if (ciphertext[i] >= 'a' && ciphertext[i] <= 'z') {
            ciphertext[i] = ((ciphertext[i] - 'a' - key + 26) % 26) + 'a';
        }
    }
}

// Function to find the most frequent character in the given text
char most_frequent_char(char* text) {
    int count[26] = {0};
    int i, max_index = 0;

    for (i = 0; i < strlen(text); i++) {
        if (text[i] >= 'a' && text[i] <= 'z') {
            count[text[i] - 'a']++;
        }
    }

    for (i = 1; i < 26; i++) {
        if (count[i] > count[max_index]) {
            max_index = i;
        }
    }

    return 'a' + max_index;
}

int main() {
    // Given ciphertext
    char ciphertext[] = "Gd_lzs_Bzdrzq";
    
    // Find the most frequent character in the ciphertext
    char most_frequent = most_frequent_char(ciphertext);
    
    // Assume that the most frequent character in English is 'e' and calculate the key
    int key = (most_frequent - 'a' + 26) % 26;

    // Decrypt the ciphertext using the calculated key
    caesar_decrypt(ciphertext, key);

    // Print the decrypted text along with the key
    printf("Decrypted text with key %d: %s\n", key, ciphertext);

    return 0;
}

