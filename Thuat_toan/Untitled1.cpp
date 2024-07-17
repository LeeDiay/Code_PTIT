#include <stdio.h>
#include <string.h>

// Function to decrypt Caesar cipher given the ciphertext and the shift value
void caesar_decrypt(char* ciphertext, int shift) {
    int i;
    for (i = 0; i < strlen(ciphertext); i++) {
        // Decrypt uppercase letters
        if (ciphertext[i] >= 'A' && ciphertext[i] <= 'Z') {
            ciphertext[i] = ((ciphertext[i] - 'A' - shift + 26) % 26) + 'A';
        }
        // Decrypt lowercase letters
        else if (ciphertext[i] >= 'a' && ciphertext[i] <= 'z') {
            ciphertext[i] = ((ciphertext[i] - 'a' - shift + 26) % 26) + 'a';
        }
    }
}

int main() {
    // Given ciphertext
    char ciphertext[] = "Li_qex_Geiwev";

    printf("Decrypted text (brute-force method):\n");

    // Brute-force attack to decrypt the message with all possible keys
    int shift;
    for (shift = 1; shift < 26; shift++) {
        // Make a copy of the original ciphertext to avoid modifying it
        char decrypted[strlen(ciphertext) + 1];
        strcpy(decrypted, ciphertext);
        
        // Decrypt the ciphertext using the current key (shift)
        caesar_decrypt(decrypted, shift);
        
        // Print the decrypted text along with the current key
        printf("With shift %d: %s\n", shift, decrypted);
    }

    return 0;
}

