package trading.trading.domain;

public class Stock {

    private Long id;
    private String name;
    private String last;
    private String high;
    private String low;
    private String pc;
    private String pcp;
    private String turnover;
    private String time;

    // 단축키 : 커맨드+n

//    public Stock(String name, String last, String high, String low, String pc, String pcp, String turnover, String time) {
//        this.name = name;
//        this.last = last;
//        this.high = high;
//        this.low = low;
//        this.pc = pc;
//        this.pcp = pcp;
//        this.turnover = turnover;
//        this.time = time;
//    }

    public String toString(){
        return "name : "+ name +
                ", last : " + last +
                ", high : " + high +
                ", low : " + low +
                ", pc : " + pc +
                ", pcp : " + pcp +
                ", turnover : " + turnover +
                ", time : " + time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getPcp() {
        return pcp;
    }

    public void setPcp(String pcp) {
        this.pcp = pcp;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
