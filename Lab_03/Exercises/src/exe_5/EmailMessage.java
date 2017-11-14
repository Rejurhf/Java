package exe_5;

public class EmailMessage{
    private String from; //required (must be e-mail)
    private String to; //required at least one (must be e-mail)
    private String subject; //optional
    private String content; //optional
    //private String mimeType;  // optional
    //private LinkedList<String> cc; //optional
    //private LinkedList<String> bcc; // optional

    protected EmailMessage(EmailBuilder builder){

    }

    public static exe_5.EmailMessage.EmailBuilder builder() {
        return new EmailMessage.EmailBuilder();
    }

    public static class EmailBuilder{
        private String from; //required (must be e-mail)
        private String to; //required at least one (must be e-mail)
        private String subject; //optional
        private String content; //optional
        //private String mimeType;  // optional
        //private LinkedList<String> cc; //optional
        //private LinkedList<String> bcc; // optional

        public EmailBuilder addFrom(String _from){
            this.from = _from;
            return this;
        }

        public EmailBuilder addTo(String _to){
            this.to = _to;
            return this;
        }

        public EmailBuilder addSubject(String _subject){
            this.subject = _subject;
            return this;
        }

        public EmailBuilder addContent(String _content){
            this.content = _content;
            return this;
        }
        /*
                public EmailBuilder mimeType(String _mimeType){
                    this.mimeType = _mimeType;
                    return this;
                }

                public EmailBuilder cc(LinkedList<String> _cc){
                    this.cc = _cc;
                    return this;
                }

                public EmailBuilder bcc(LinkedList<String> _bcc){
                    this.bcc = _bcc;
                    return this;
                }
          */
        public EmailMessage build(){
            EmailMessage message = EmailMessage.builder().addFrom("a")
                    .addTo("b").addSubject("c").addContent("d").build();
            return message;
        }
    }
}
