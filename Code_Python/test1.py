import requests

burp0_url = "https://qldt.ptit.edu.vn:443/api/srm/w-locdsdiemsinhvien?hien_thi_mon_theo_hkdk=false"
burp0_cookies = {"ASP.NET_SessionId": "khlevcusz2qjybxgegzo0cwo"}
burp0_headers = {"Sec-Ch-Ua": "\"Chromium\";v=\"119\", \"Not?A_Brand\";v=\"24\"", "Sec-Ch-Ua-Mobile": "?0", "Authorization": "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6Ii02NzgyNTIyMzAxNjY0MzU5ODA5IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6IkIyMURDTVIxMjEiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL2FjY2Vzc2NvbnRyb2xzZXJ2aWNlLzIwMTAvMDcvY2xhaW1zL2lkZW50aXR5cHJvdmlkZXIiOiJBU1AuTkVUIElkZW50aXR5IiwiQXNwTmV0LklkZW50aXR5LlNlY3VyaXR5U3RhbXAiOiI2ZGU0ODVhMy05ZGVhLTRlMGYtOThkYi1kMWU0NDhkZDhhMGMiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3JvbGUiOiJTSU5IVklFTiIsInNlc3Npb24iOiItNzEyMjk5OTU0Nzg3MjExMDIwOSIsImR2cGMiOiItNjQyNTg1NTUwNjQ5Mzc1MDU1MSIsIm5hbWUiOiJMw70gS2jDoW5oIExpbmgiLCJwYXNzdHlwZSI6IjAiLCJ1Y3YiOiIyMTAyNDQ0MTYzIiwicHJpbmNpcGFsIjoiTGluaExLLkIyMU1SMTIxQHN0dS5wdGl0LmVkdS52biIsIndjZiI6IjAiLCJuYmYiOjE3MTY4MTgyMTksImV4cCI6MTcxNjgyMDAxOSwiaXNzIjoiZWR1c29mdCIsImF1ZCI6ImFsbCJ9.MbKhFCAupLctW771S5-u4t-uy92nAxnAiIk1VNjWDUo", "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.6045.199 Safari/537.36", "Content-Type": "text/plain", "Accept": "application/json, text/plain, */*", "Idpc": "-6425855506493750551", "Sec-Ch-Ua-Platform": "\"Windows\"", "Origin": "https://qldt.ptit.edu.vn", "Sec-Fetch-Site": "same-origin", "Sec-Fetch-Mode": "cors", "Sec-Fetch-Dest": "empty", "Referer": "https://qldt.ptit.edu.vn/", "Accept-Encoding": "gzip, deflate, br", "Accept-Language": "en-US,en;q=0.9", "Priority": "u=1, i"}
requests.post(burp0_url, headers=burp0_headers, cookies=burp0_cookies)