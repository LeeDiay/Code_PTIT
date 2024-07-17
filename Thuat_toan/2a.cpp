#include <stdio.h>
#include <string.h>

// Function to decrypt OTP cipher given the ciphertext and the key
void otp_decrypt(char* ciphertext, char* key) {
    int i;
    for (i = 0; i < strlen(ciphertext); i++) {
        char decrypted_char = ciphertext[i] ^ key[i];
        printf("%c", decrypted_char);
    }
    printf("\n");
}

int main() {
    // Given ciphertext and key
    char ciphertext[] = "BLWP";
    char key[] = "IESR";

    // Ensure ciphertext and key have the same length
    if (strlen(ciphertext) != strlen(key)) {
        printf("Error: Ciphertext and key have different lengths.\n");
        return 1;
    }

    printf("Decrypted message: ");
    otp_decrypt(ciphertext, key);

    return 0;
}

