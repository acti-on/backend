package actiOn.config;

public enum OAuth2Configuration {

    //OAuth 로그인 성공 시 리디렉션 될 곳을 설정합니다.
    //아래의 예시에서는 구글 로그인 성공 시, http://localhost:80/ 으로 리디렉션 됩니다.
    SCHEME("http"),
    HOST("ac-ti-on.s3-website.ap-northeast-2.amazonaws.com"),
    PORT("80"),
    PATH("/oauth2/authorization/google/success");

    private final String value;

    OAuth2Configuration(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
