package cn.edu.jssvc.xyp.lookforjob1;

public class Job {
    private String name;
    private int imgID;
    private String introduce;

    public Job(String name, int imgID, String s, String introduce) {
        this.name = name;
        this.imgID = imgID;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
