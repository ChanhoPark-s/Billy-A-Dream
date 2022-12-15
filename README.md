# :pushpin: Billy-A-Dream
>개인간 렌탈 거래 플랫폼 <br>
><br>
><h4><b>프로젝트 자료</b></h4>
><a href="https://youtu.be/JL0fxZF3Tb0" style="margin-top : 10px;"><img src="https://user-images.githubusercontent.com/106065178/207799552-27c7f9ec-3320-492a-b69d-23fe1783d32a.jpg" width="80" height="35"></a>
><a href="https://diagnostic-raven-02c.notion.site/2e50d5da245f49dfa59e756097219ff6?v=36f05fd3737348478d4ffc22c58814e9" class="sbox" ><img class="profile" style="width: 45px;  margin-bottom: 3px; margin-left: 25px;" src="https://user-images.githubusercontent.com/106065178/207617352-af4e6185-95a8-449e-80f2-b17e711e7347.png"></a>

</br>

## 1. 제작 기간 & 참여 인원
- 22.09.12 ~ 22.09.30 (3주)
- 팀프로젝트(박찬호,장정훈,강전혁,이대곤)

</br>

## 2. 사용 기술
  - Java 11
  - Spring, Spring Security
  - Gradle
  - AWS EC2, AWS RDS
  - Oracle
  - Jsp
  - Tomcat
  - Html, Css, Javascript, Jquery

</br>

## 3. ERD 설계
![DB 테이블 구조](https://user-images.githubusercontent.com/106065178/207790738-20131029-2d6e-4dd8-95c7-ce60ef7710d9.png)

## 3.1 시퀀스 다이어그램
<p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207792583-247a58e8-c9ce-48a5-9e4d-9c4d579299b9.png" width="400" height="400">
  </p>
  <br>


## 4. 핵심 기능
이 서비스의 핵심 기능은 개인간 결제 및 채팅입니다.  
사용자는 원하는 지역의 상품을 구매할 수 있고, 판매자와 채팅을 통해 원만한 거래를 할 수 있습니다.<br>
또한 여러 카카오API를 통한 이용과 보안서비스를 통해 사용자의 편의 및 신뢰를 추구하였습니다. 

<details>
<summary><b>핵심 기능 설명 펼치기</b></summary>
<div markdown="1">

### 4.1. IP확인
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207794240-128e7b49-869d-4589-93b3-aa310beab9b1.png">
  </p>
  <br>
  
- 접속한 IP를 확인하여 회원가입 당시 등록된 IP와 다를 시 휴대폰 번호 인증을 통한 로그인을 하도록 하였습니다.
<br>
  
### 4.2. 비밀번호 암호화
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207795103-2fa3b5da-4615-4288-a59b-51cea4fc987e.png" width="400" height="50">
  </p>
  <br>

- Spring Security를 활용하여 BCryptPasswordEncoder 라는 암호화를 사용하여 비밀번호를 암호화 저장하였습니다.
<br>
  
### 4.3. 휴대폰 & 이메일 인증
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207797115-25ba4819-8617-477e-a81c-8a6c186fe43d.png" width="700" height="300">
  </p>
  <br>
  
- Twilio API 와 Naver Mail API를 활용하여 인증 체계를 구성하였습니다.

  <br>
  
### 4.4. 사용자 편의 지도 검색
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207798202-ab4f3936-397a-46c9-94f9-42c44a7e823d.png" width="500" height="400">
  </p>
  <br>

- 카카오맵 API를 통한 사용자 편의 검색 기능 제공을 하였습니다.
  
<br>
  
### 4.5. 채팅 기능
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207815703-37ceb3e3-afe4-4f77-add7-617eb4c2071b.png" width="650" height="300">
  </p>
  <br>

- Json 과 Ajax를 통한 채팅을 제공하여 판매자와 구매자 사이의 편의성과 신뢰성을 주었습니다.
<br> 
  
 ### 4.6. 카카오 결제 API
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207840399-a151a287-1cae-4b61-8aa2-075c4bb682b1.png" width="650" height="300">
  </p>
  <br>

- 카카오 결제 API 를 통한 사용자 편의 시스템을 사용하였습니다.
  
<br>
  
   ### 4.7. 카카오 결제 API
  <p align="center">
  <img src="https://user-images.githubusercontent.com/106065178/207845517-2305d2d9-e18e-4edd-927d-c2ffc45bc106.png" width="350" height="300">
  </p>
  <br>

- 카카오톡 API 를 활용해 상담사와 빠른 상담을 할 수 있는 사용자 편의 시스템을 사용하였습니다.

</div>
</details>

</br>

## 5. 시연 영상
 <p align="center"><img src="https://user-images.githubusercontent.com/106065178/207815184-27af8994-b177-44a3-bb7e-4142ed600c0d.gif" width="600" height="300">
<br><a href="https://youtu.be/JL0fxZF3Tb0">[&nbsp;Youtube&nbsp;]</a><br><br>
</p>

## 6. 핵심 트러블 슈팅
### 6.1. 컨텐츠 필터와 페이징 처리 문제
- 저는 이 서비스가 페이스북이나 인스타그램 처럼 가볍게, 자주 사용되길 바라는 마음으로 개발했습니다.  
때문에 페이징 처리도 무한 스크롤을 적용했습니다.

- 하지만 [무한스크롤, 페이징 혹은 “더보기” 버튼? 어떤 걸 써야할까](https://cyberx.tistory.com/82) 라는 글을 읽고 무한 스크롤의 단점들을 알게 되었고,  
다양한 기준(카테고리, 사용자, 등록일, 인기도)의 게시물 필터 기능을 넣어서 이를 보완하고자 했습니다.

- 그런데 게시물이 필터링 된 상태에서 무한 스크롤이 동작하면,  
필터링 된 게시물들만 DB에 요청해야 하기 때문에 아래의 **기존 코드** 처럼 각 필터별로 다른 Query를 날려야 했습니다.

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">

~~~java
/**
 * 게시물 Top10 (기준: 댓글 수 + 좋아요 수)
 * @return 인기순 상위 10개 게시물
 */
public Page<PostResponseDto> listTopTen() {

    PageRequest pageRequest = PageRequest.of(0, 10, Sort.Direction.DESC, "rankPoint", "likeCnt");
    return postRepository.findAll(pageRequest).map(PostResponseDto::new);
}

/**
 * 게시물 필터 (Tag Name)
 * @param tagName 게시물 박스에서 클릭한 태그 이름
 * @param pageable 페이징 처리를 위한 객체
 * @return 해당 태그가 포함된 게시물 목록
 */
public Page<PostResponseDto> listFilteredByTagName(String tagName, Pageable pageable) {

    return postRepository.findAllByTagName(tagName, pageable).map(PostResponseDto::new);
}

// ... 게시물 필터 (Member) 생략 

/**
 * 게시물 필터 (Date)
 * @param createdDate 게시물 박스에서 클릭한 날짜
 * @return 해당 날짜에 등록된 게시물 목록
 */
public List<PostResponseDto> listFilteredByDate(String createdDate) {

    // 등록일 00시부터 24시까지
    LocalDateTime start = LocalDateTime.of(LocalDate.parse(createdDate), LocalTime.MIN);
    LocalDateTime end = LocalDateTime.of(LocalDate.parse(createdDate), LocalTime.MAX);

    return postRepository
                    .findAllByCreatedAtBetween(start, end)
                    .stream()
                    .map(PostResponseDto::new)
                    .collect(Collectors.toList());
    }
~~~

</div>
</details>

- 이 때 카테고리(tag)로 게시물을 필터링 하는 경우,  
각 게시물은 최대 3개까지의 카테고리(tag)를 가질 수 있어 해당 카테고리를 포함하는 모든 게시물을 질의해야 했기 때문에  
- 아래 **개선된 코드**와 같이 QueryDSL을 사용하여 다소 복잡한 Query를 작성하면서도 페이징 처리를 할 수 있었습니다.

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

~~~java
/**
 * 게시물 필터 (Tag Name)
 */
@Override
public Page<Post> findAllByTagName(String tagName, Pageable pageable) {

    QueryResults<Post> results = queryFactory
            .selectFrom(post)
            .innerJoin(postTag)
                .on(post.idx.eq(postTag.post.idx))
            .innerJoin(tag)
                .on(tag.idx.eq(postTag.tag.idx))
            .where(tag.name.eq(tagName))
            .orderBy(post.idx.desc())
                .limit(pageable.getPageSize())
                .offset(pageable.getOffset())
            .fetchResults();

    return new PageImpl<>(results.getResults(), pageable, results.getTotal());
}
~~~

</div>
</details>

</br>

## 7. 그 외 트러블 슈팅
<details>
<summary>npm run dev 실행 오류</summary>
<div markdown="1">

- Webpack-dev-server 버전을 3.0.0으로 다운그레이드로 해결
- `$ npm install —save-dev webpack-dev-server@3.0.0`

</div>
</details>

<details>
<summary>vue-devtools 크롬익스텐션 인식 오류 문제</summary>
<div markdown="1">
  
  - main.js 파일에 `Vue.config.devtools = true` 추가로 해결
  - [https://github.com/vuejs/vue-devtools/issues/190](https://github.com/vuejs/vue-devtools/issues/190)
  
</div>
</details>

<details>
<summary>ElementUI input 박스에서 `v-on:keyup.enter="메소드명"`이 정상 작동 안하는 문제</summary>
<div markdown="1">
  
  - `v-on:keyup.enter.native=""` 와 같이 .native 추가로 해결
  
</div>
</details>

<details>
<summary> Post 목록 출력시에 Member 객체 출력 에러 </summary>
<div markdown="1">
  
  - 에러 메세지(500에러)
    - No serializer found for class org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationConfig.SerializationFeature.FAIL_ON_EMPTY_BEANS)
  - 해결
    - Post 엔티티에 @ManyToOne 연관관계 매핑을 LAZY 옵션에서 기본(EAGER)옵션으로 수정
  
</div>
</details>
    
<details>
<summary> 프로젝트를 git init으로 생성 후 발생하는 npm run dev/build 오류 문제 </summary>
<div markdown="1">
  
  ```jsx
    $ npm run dev
    npm ERR! path C:\Users\integer\IdeaProjects\pilot\package.json
    npm ERR! code ENOENT
    npm ERR! errno -4058
    npm ERR! syscall open
    npm ERR! enoent ENOENT: no such file or directory, open 'C:\Users\integer\IdeaProjects\pilot\package.json'
    npm ERR! enoent This is related to npm not being able to find a file.
    npm ERR! enoent

    npm ERR! A complete log of this run can be found in:
    npm ERR!     C:\Users\integer\AppData\Roaming\npm-cache\_logs\2019-02-25T01_23_19_131Z-debug.log
  ```
  
  - 단순히 npm run dev/build 명령을 입력한 경로가 문제였다.
   
</div>
</details>    

<details>
<summary> 태그 선택후 등록하기 누를 때 `object references an unsaved transient instance - save the transient instance before flushing` 오류</summary>
<div markdown="1">
  
  - Post 엔티티의 @ManyToMany에 영속성 전이(cascade=CascadeType.ALL) 추가
    - JPA에서 Entity를 저장할 때 연관된 모든 Entity는 영속상태여야 한다.
    - CascadeType.PERSIST 옵션으로 부모와 자식 Enitity를 한 번에 영속화할 수 있다.
    - 참고
        - [https://stackoverflow.com/questions/2302802/object-references-an-unsaved-transient-instance-save-the-transient-instance-be/10680218](https://stackoverflow.com/questions/2302802/object-references-an-unsaved-transient-instance-save-the-transient-instance-be/10680218)
   
</div>
</details>    

<details>
<summary> JSON: Infinite recursion (StackOverflowError)</summary>
<div markdown="1">
  
  - @JsonIgnoreProperties 사용으로 해결
    - 참고
        - [http://springquay.blogspot.com/2016/01/new-approach-to-solve-json-recursive.html](http://springquay.blogspot.com/2016/01/new-approach-to-solve-json-recursive.html)
        - [https://stackoverflow.com/questions/3325387/infinite-recursion-with-jackson-json-and-hibernate-jpa-issue](https://stackoverflow.com/questions/3325387/infinite-recursion-with-jackson-json-and-hibernate-jpa-issue)
        
</div>
</details>  
    
<details>
<summary> H2 접속문제</summary>
<div markdown="1">
  
  - H2의 JDBC URL이 jdbc:h2:~/test 으로 되어있으면 jdbc:h2:mem:testdb 으로 변경해서 접속해야 한다.
        
</div>
</details> 
    
<details>
<summary> 컨텐츠수정 모달창에서 태그 셀렉트박스 드랍다운이 뒤쪽에 보이는 문제</summary>
<div markdown="1">
  
   - ElementUI의 Global Config에 옵션 추가하면 해결
     - main.js 파일에 `Vue.us(ElementUI, { zIndex: 9999 });` 옵션 추가(9999 이하면 안됌)
   - 참고
     - [https://element.eleme.io/#/en-US/component/quickstart#global-config](https://element.eleme.io/#/en-US/component/quickstart#global-config)
        
</div>
</details> 

<details>
<summary> HTTP delete Request시 개발자도구의 XHR(XMLHttpRequest )에서 delete요청이 2번씩 찍히는 이유</summary>
<div markdown="1">
  
  - When you try to send a XMLHttpRequest to a different domain than the page is hosted, you are violating the same-origin policy. However, this situation became somewhat common, many technics are introduced. CORS is one of them.

        In short, server that you are sending the DELETE request allows cross domain requests. In the process, there should be a **preflight** call and that is the **HTTP OPTION** call.

        So, you are having two responses for the **OPTION** and **DELETE** call.

        see [MDN page for CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS).

    - 출처 : [https://stackoverflow.com/questions/35808655/why-do-i-get-back-2-responses-of-200-and-204-when-using-an-ajax-call-to-delete-o](https://stackoverflow.com/questions/35808655/why-do-i-get-back-2-responses-of-200-and-204-when-using-an-ajax-call-to-delete-o)
        
</div>
</details> 

<details>
<summary> 이미지 파싱 시 og:image 경로가 달라서 제대로 파싱이 안되는 경우</summary>
<div markdown="1">
  
  - UserAgent 설정으로 해결
        - [https://www.javacodeexamples.com/jsoup-set-user-agent-example/760](https://www.javacodeexamples.com/jsoup-set-user-agent-example/760)
        - [http://www.useragentstring.com/](http://www.useragentstring.com/)
        
</div>
</details> 
    
<details>
<summary> 구글 로그인으로 로그인한 사용자의 정보를 가져오는 방법이 스프링 2.0대 버전에서 달라진 것</summary>
<div markdown="1">
  
  - 1.5대 버전에서는 Controller의 인자로 Principal을 넘기면 principal.getName(0에서 바로 꺼내서 쓸 수 있었는데, 2.0대 버전에서는 principal.getName()의 경우 principal 객체.toString()을 반환한다.
    - 1.5대 버전에서 principal을 사용하는 경우
    - 아래와 같이 사용했다면,

    ```jsx
    @RequestMapping("/sso/user")
    @SuppressWarnings("unchecked")
    public Map<String, String> user(Principal principal) {
        if (principal != null) {
            OAuth2Authentication oAuth2Authentication = (OAuth2Authentication) principal;
            Authentication authentication = oAuth2Authentication.getUserAuthentication();
            Map<String, String> details = new LinkedHashMap<>();
            details = (Map<String, String>) authentication.getDetails();
            logger.info("details = " + details);  // id, email, name, link etc.
            Map<String, String> map = new LinkedHashMap<>();
            map.put("email", details.get("email"));
            return map;
        }
        return null;
    }
    ```

    - 2.0대 버전에서는
    - 아래와 같이 principal 객체의 내용을 꺼내 쓸 수 있다.

    ```jsx
    UsernamePasswordAuthenticationToken token =
                    (UsernamePasswordAuthenticationToken) SecurityContextHolder
                            .getContext().getAuthentication();
            Map<String, Object> map = (Map<String, Object>) token.getPrincipal();

            String email = String.valueOf(map.get("email"));
            post.setMember(memberRepository.findByEmail(email));
    ```
        
</div>
</details> 
    
<details>
<summary> 랭킹 동점자 처리 문제</summary>
<div markdown="1">
  
  - PageRequest의 Sort부분에서 properties를 "rankPoint"를 주고 "likeCnt"를 줘서 댓글수보다 좋아요수가 우선순위 갖도록 설정.
  - 좋아요 수도 똑같다면..........
        
</div>
</details> 
    
</br>

## 8. 회고 / 느낀점
>프로젝트 개발 회고 글: https://zuminternet.github.io/ZUM-Pilot-integer/
