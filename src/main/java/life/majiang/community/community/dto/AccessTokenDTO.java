package life.majiang.community.community.dto;

public class AccessTokenDTO {
    //the client id you received from  Github for your GitHub App
    private String client_id;
    //required the client secret you received from  Github for your GitHub App
    private String client_secret;
    //The code you received as response to step1
    private String code;
    //The URL in your application where users are sent after authorization
    private String redirect_uri;
    //the unguessable random string you provided
    private String state;

    public String getClient_id() {
        return client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public String getCode() {
        return code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public void setState(String state) {
        this.state = state;
    }
}
