package oop;

public class BasicUserService {

    private UserRepository userRepository = new BasicUserRepository();         // 업캐스팅이라 Basic이든 Custom이든 상관없음
//    private BasicUserRepository userRepository2 = (BasicUserRepository) userRepository;   // 다운캐스팅
//    private CustomUserRepository userRepository2 = (CustomUserRepository) userRepository;   // 다운캐스팅인데 이건 안됨
    /*
        why?
        업캐스팅은 쉽게 말해서 선풍기를 가전제품으로 치겠다 -> 다운캐스팅도 같은 클래스로 내려줘야함 가전제품 -> 선풍기
        그래서 업캐스팅을 쓸때는 5번줄에 Basic이든 Custom이든 상관없으나
        다운 캐스팅을 할 때에는 업캐스팅했을때 형태 똑같이 맞춰줘야함
     */

    public BasicUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(){
        System.out.println("기본 사용자 추가");
        userRepository.insert();
    }
}
