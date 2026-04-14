package reentry;

abstract class Assignment{
    String topic;
    String trainer;
    Assignment(String topic, String trainer){
        this.topic=topic;
        this.trainer=trainer;
    }
    public abstract void submit();
}
class Java extends Assignment{
    Java(String topic, String trainer){
        super(topic, trainer);
    }
   
    public  void submit(){
        System.out.println("Submit Asssignment on "+ topic+" to "+trainer);
    }
}
class WebTech extends Assignment{
    WebTech(String topic, String trainer){
        super(topic,trainer);
    }
    public  void submit(){
        System.out.println("Submit Asssignment on "+ topic+" to "+trainer);
    }
}
class SQL extends Assignment{
    SQL(String topic, String trainer){
        super(topic,trainer);
    }
    public  void submit(){
        System.out.println("Submit Asssignment on "+ topic+" to "+trainer);
    }
}
class Main{
    public static void main(String args[]){
        Assignment ref=new Java("inheritance","Tabrez");
        ref.submit();
        Assignment ref1=new WebTech("DOM","Santhanu");
        ref1.submit();
        Assignment ref2=new SQL("Joins","Nagaraj");
        ref2.submit();
    }
    
}