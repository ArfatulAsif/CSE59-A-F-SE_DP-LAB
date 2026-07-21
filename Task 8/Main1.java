class HttpRequest {

    private final String url ;
    private final String method ;
    private final String headers ;
    private final String body ;

    private HttpRequest(Builder builder ) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers= builder.headers;
        this.body = builder.body;

    }

    public void send() {
        System.out.println("Sending"+ method + "request to"+ url);
        System.out.println("Headers:" + headers);
        System.out.println("Body:"+ body);
    }

    public static class Builder {
        private String url;

        private String method ="GET";
        private String headers ="";
        private String body ="";

        public Builder(String url) {
            this.url = url;
        }
        public Builder setMethod(String method){
            this.method = method;
            return this;
        }
        public Builder addHeader (String header) {
            if (!headers.isEmpty()){
                header += ";";
            }
            headers += header;
            return this;
        }
        public Builder setBody(String body){
            this.body= body;
            return this;
        }
        public HttpRequest build(){
            return new HttpRequest (this);
        }
    }
}

public class Main {

    public static void main(String[]args) {
        HttpRequest request = new HttpRequest.Builder("http://api.example.com/data")
        .setMethod ("POST")
        .addHeader("Authorization: Bearer token123")
        .addHeader("Content-Type: application/json")
        .setBody("{\"user_id\":404}")
        .build();

        request.send();

        System.out.println();

        HttpRequest getRequest = new HttpRequest.Builder("http://api.example.com/users")
        .addHeader("Accept: application/json")
        .build();
    getRequest.send();
    }
}

