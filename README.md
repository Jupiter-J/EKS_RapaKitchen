# EKS_RapaKitchen
---
###  구현 환경
- kubernetes : v 1.23.9
- eksctl : 0.115.0
- Region : ap-northeast-2 (서울)   
- AZ
  - ap-northeast-2a
  - ap-northeast-2b
  - ap-northeast-2c
  - ap-northeast-2d 
  
- **VPC CIDR 대역**
  - 192.168.0.0/16
- **Worker Public Subnet CIDR 대역 - 각 가용영역에 하나씩 배치**
  - 192.168.252.0/24
  - 192.168.253.0/24
  - 192.168.254.0/24
  - 192.168.255.0/24
- **Worker Private Subnet CIDR 대역  - 각 가용영역에 하나씩 배치**
  - 192.168.0.0/20
  - 192.168.16.0/20
  - 192.168.32.0/20
  - 192.168.48.0/20
- **Database Private Subnet CIDR 대역 - a, b 가용영역에 하나씩 배치**
  - 192.168.250.0/24
  - 192.168.251.0/24
- **Bastion Host : 가용영역 A Public Subnet에 배치**
  - 프로젝트 작업 : cloud9 사용   

##  Structure Diagram
<img width="729" alt="image" src="https://user-images.githubusercontent.com/73453283/197961285-8d03ca90-3955-4455-88a0-2748da050c9f.png">

##  Service Structure Diagram
<img width="642" alt="image" src="https://user-images.githubusercontent.com/73453283/197961395-6b88d4de-26f3-4cf5-81c6-dca9e70dc799.png">

## RapaKitchen
![image](https://user-images.githubusercontent.com/73453283/197978101-98d82ab7-6bad-44c2-89a3-20ff44e80879.png)


