import socket

# Khởi tạo client socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Kết nối tới server đang chạy trên cổng 12345
client_socket.connect(('localhost', 12345))

# Gửi thông điệp cho server
message = "Hello, I am Lê Đức Anh - B21DCAT026 client."
client_socket.send(message.encode())

# Nhận thông điệp từ server
data = client_socket.recv(1024).decode()
print("Server trả lời:", data)

# Đóng kết nối
client_socket.close()
