# 👨‍🏫s.o.s
![Image](https://github.com/user-attachments/assets/6031de80-acf5-4126-973d-ca5a13030580)<br><br>
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
![Image](https://github.com/user-attachments/assets/4b25033a-b76e-48d4-9178-faba6cb8ba75)
<br><br>

## 개발 환경
![Image](https://github.com/user-attachments/assets/8f1fda39-c557-45a8-8fea-2e31c375db93)
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
    <img src="https://github.com/user-attachments/assets/ae70059f-76cb-4a03-acb0-cdf351e23e6c"
         alt="image1" style="height: 400px;" />
  </p>
  
  <p>
    <strong>2. 소셜 로그인 - 네이버 </strong> <br>
    <img src="https://github.com/user-attachments/assets/583f24ac-d96f-4081-abd1-acfaa64b4065"
         alt="image2" style="height: 400px;" />
  </p>
  
  <p>
     <strong>3. 소셜 로그인 - 구글 </strong> <br> 
    <img src="https://github.com/user-attachments/assets/670d22ed-5d60-44d1-a7a0-ae37062f508d"
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
    <img src="https://github.com/user-attachments/assets/62d3db3f-2d01-45a6-9b81-e902c827e502" 
         alt="image1" style="height: 400px;" />
  </p>
  
  <p>
    <strong>2. 강의 저장</strong> <br>
    <img src="https://github.com/user-attachments/assets/bac4c0ba-60ef-4112-806d-8c25c6f9cc8a" 
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
    <img src="https://github.com/user-attachments/assets/7335b99b-4c0f-477f-92ba-f86e2f425c41" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 쪽지 기능
- 사용자나 강사에게 쪽지를 보낼 수 있다.
- 읽은 쪽지는 하얀색, 안 읽은 쪽지는 회색으로 구별이 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/e8c31e07-e11e-4714-994b-0a57b6e91d44" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 게시글 관리
- 문의/자유/QnA 게시판 혹은 코스 안에 있는 게시판 안에 있는 QnA/수강후기 게시판에 글을 작성할 수 있다.
 <details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/d11d8b1a-ae87-4fb4-8e09-5a84e33ec3f1" 
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
    <img src="https://github.com/user-attachments/assets/0f703754-30e6-4e28-a5f6-1dd11447cca2" 
         alt="image1" style="height: 400px;" />
  </p>
   
  <p>
    <strong>2. 강의 등록</strong><br>
    <img src="https://github.com/user-attachments/assets/df416d8d-40eb-49dc-9333-17413ab1c17b" 
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
    <img src="https://github.com/user-attachments/assets/199c3372-3d98-428e-8b4a-a033edbe0cf9" 
         alt="image1" style="height: 400px;" />
  </p>
</details>

### 강의 코스 관리
- 강사가 신청한 코스에 허가하거나 등록되어 있는 코스를 삭제할 수 있다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/b6bfd1c8-f5b4-40ee-a7ee-24de9892bce7" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 교재 관리
- 사이트 내에서 판매할 수 있는 교재를 등록할 수 있다.
- 검색은 등록 상태(승인완료/승인대기)와 과목별로 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/270376bb-ffc4-44dd-bab7-a8a2ed858adf" 
         alt="image1" style="height: 400px;" />
  </p>
</details>


### 주문 관리
- 주문 목록들을 확인하고 주문상태를 관리할 수 있다.
- 검색은 주문상태, 주문일, 주문번호로 가능하다.
<details>
  <summary>🔽 이미지 보기</summary>
  <p>
    <img src="https://github.com/user-attachments/assets/0e1f9bd7-bb9a-4398-a822-0566b9d770ca" 
         alt="image1" style="height: 400px;" />
  </p>
</details>

