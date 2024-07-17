import socket

# Khởi tạo server socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Lắng nghe kết nối trên cổng 12345
server_socket.bind(('localhost', 12345))
server_socket.listen(1)

print("Server đang chạy và chờ kết nối...")

# Chấp nhận kết nối từ client
client_socket, client_address = server_socket.accept()
print("Đã kết nối tới", client_address)

# Nhận dữ liệu từ client
data = client_socket.recv(1024).decode()
print("Client gửi:", data)

# Gửi lại dữ liệu cho client
message = "Hello, I am Lê Đức Anh - B21DCAT026 server."
client_socket.send(message.encode())

# Đóng kết nối
client_socket.close()
server_socket.close()
