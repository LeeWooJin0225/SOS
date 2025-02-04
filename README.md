# 👨‍🏫s.o.s
수험생 커뮤니티와 학습을 결합한 무료 온라인 교육 플랫폼
<br>
<br>

## 프로젝트 소개
> S.O.S 홈페이지는 학생 간 정보 공유와 강사와의 직접적인 소통을 강화하여, 누구나 자유롭게 학습할 수 있는 소통 중심의 교육 플랫폼입니다. 경제적 부담 없이 지식을 습득하고 교류할 수 있는 환경을 제공합니다.
<br>

## 개발 기간 및 인원
> 2024.11.29 ~ 2025.01.13 (5주)<br>
> 6명 (Full-Stack)
<br>

## 목차
> 1. [ERD 구조](#erd-구조)
> 2. [개발 환경](#개발-환경)
> 3. [주요 기능](#주요-기능)
<br>

## ERD 구조
![image](https://github.com/user-attachments/assets/ea17cdeb-3599-43ab-b3d0-b07655129b72)
<br><br>

## 개발 환경
![image](https://github.com/user-attachments/assets/cfb14d85-ff25-4ad5-868a-740b7c83e984)
<br><br>

## 주요 기능
<table align="center">
  <tr>
   <th>
    사용자
   </th>
   <th>
    강사
   </th>
   <th >
    관리자
   </th>
   </tr>
  <tr>
   <td align="left" width="350px" class="사용자">
    - 회원가입, 로그인
    <br/>
    - 강의 시청
    <br/>
    - 교재 구매
   <br/>
    - 쪽지 기능
   <br/>
   </td>
   <td align="left" width="350px" class="강사">
    - 회원가입, 로그인
    <br/>
    - 강의 관리
   </td>
   <td align="left" width="350px" class="관리자">
    - 회원 및 강사 상태 관리
    <br/>
     - 강의 코스 관리
    <br/>
     - 교재 관리
    <br/>
    - 주문 관리
   </td>
  </tr>
</table>

<br><br>

## [ 사용자 기능 ]
### 회원가입, 로그인
- 사용자는 아이디, 이메일, 비밀번호, 이름, 연락처, 주소를 입력하여 회원가입이 가능하다.
  - 이메일 인증을 통해 이메일이 유효한지 검사한다.
- 구글과 네이버 계정을 통한 회원가입이 가능하다.
- 회원가입시 입력한 이메일과 비밀번호를 이용해 로그인이 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  
  <p>
    <strong>1. 회원가입 - 이메일 인증</strong> <br>
    <img src="https://github.com/user-attachments/assets/f5b264f0-b0c3-4da5-a38f-96d40d7aaac2"
         alt="image1" style="height: 400px;" />
  </p>
  
  <p>
    <strong>2. 소셜 로그인 - 네이버 </strong> <br>
    <img src="https://github.com/user-attachments/assets/c7d8324b-bdde-46ae-9b38-6b7b754455d2"
         alt="image2" style="height: 400px;" />
  </p>
  
  <p>
     <strong>3. 소셜 로그인 - 구글 </strong> <br> 
    <img src="https://github.com/user-attachments/assets/2a7afcbe-6daf-44e9-a987-d622dba46659"
         alt="image3" style="height: 400px;" />
  </p>
</details>


### 강의 시청
- 로그인 후, 듣고 싶은 강의 코스를 수강신청이 가능하다.
- 수강신청한 코스로 들어가 개별 강의 시청이 가능하다.
- 듣다가 시청을 중단한 강의는 나중에 이어볼 수 있다.
- 강의를 오프라인에서 들을 수 있도록 저장할 수 있는 기능을 제공한다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <strong>1. 강의 시청</strong> <br>
    <img src="https://github.com/user-attachments/assets/d14b043d-be1b-49ed-b65b-a37b1577b296" 
         alt="image1" style="height: 400px;" />
  </p>
  
  <p>
    <strong>2. 강의 저장</strong> <br>
    <img src="https://github.com/user-attachments/assets/a5c01f0e-4d3e-4683-93bc-4b966be6ea30" 
         alt="image2" style="height: 400px;" />
  </p>
</details>



### 교재 구매
- 교재를 판매하는 사이트에서 구매하고자 하는 교재를 바로 구매하거나 장바구니에 담을 수 있다.
- 재고가 5개 초과일 경우, 5개까지만 구매가 가능하고 5개 이하일 경우에는 재고 수만큼 구매할 수 있다.
- 카카오페이 API를 연동하여 결제를 할 수 있다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/5d3fc213-0bf4-4236-b6a0-bb7b5e8f413f" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 쪽지 기능
- 사용자나 강사에게 쪽지를 보낼 수 있다.
- 읽은 쪽지는 하얀색, 안 읽은 쪽지는 회색으로 구별이 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/5833ff9f-0b07-46f7-b3ea-0443f49c9d80" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 게시글 관리
- 문의/자유/QnA 게시판 혹은 코스 안에 있는 게시판 안에 있는 QnA/수강후기 게시판에 글을 작성할 수 있다.
 <details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/330ca371-6429-4da8-8273-1d77bd19c861" 
         alt="image1" style="height: 400px;" />
  </p>
</details>

<br><br>
## [ 강사 기능 ]

### 회원가입, 로그인
- 강사도 사용자와 같이 회원가입을 통해 사용자 등록이 가능하다.
  - 일반 사용자들과는 다르게 강사는 회원가입을 한 후, 관리자의 허가 후에 로그인을 할 수 있다.
- - 회원가입시 입력한 이메일과 비밀번호를 이용해 로그인이 가능하다.
 
### 강의 관리
- 강좌 등록을 통해 코스 등록을 할 수 있다.
  - 코스 등록 후, 관리자의 허가가 있어야 사용자에게 보여지고 수강신청이 가능해진다.
 
  
<details>
  <summary>🔽 이미지 보기</summary>
  
  <p>
    <strong>1. 코스 등록</strong><br>
    <img src="https://github.com/user-attachments/assets/a8ddb085-1b1a-43e6-b13c-8b0f90eea28d" 
         alt="image1" style="height: 400px;" />
  </p>
   
  <p>
    <strong>2. 강의 등록</strong><br>
    <img src="https://github.com/user-attachments/assets/42f62945-5619-4df7-9df2-732b5bc3d8b4" 
         alt="image2" style="height: 400px;" />
  </p>

</details>

<br><br>
## [ 관리자 기능 ]

### 사용자 및 강사 상태 관리
- 사용자나 강사의 상태를 관리할 수 있다.
  - 사용자는 정지/정상으로 상태값을 관리할 수 있다.
  - 강사 역시 정지/정상으로 상태값 관리가 가능하며, 강사로 활동할 수 있는 권한을 허가할 수 있다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/c130e049-043d-4bd5-b9a4-369fa18055dc" 
         alt="image1" style="height: 400px;" />
  </p>
</details>

### 강의 코스 관리
- 강사가 신청한 코스에 허가하거나 등록되어 있는 코스를 삭제할 수 있다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/e017469f-1ca5-4f04-9a91-d17676e1de47" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 교재 관리
- 사이트 내에서 판매할 수 있는 교재를 등록할 수 있다.
- 검색은 등록 상태(승인완료/승인대기)와 과목별로 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/6b3b14b0-7492-4a86-8882-cdd7ed4ed7ef" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 주문 관리
- 주문 목록들을 확인하고 주문상태를 관리할 수 있다.
- 검색은 주문상태, 주문일, 주문번호로 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/7805bd64-ec35-41ec-bb31-64e241458706" 
         alt="image1" style="height: 400px;" />
  </p>
</details>

