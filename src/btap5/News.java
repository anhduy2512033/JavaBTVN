package btap5;

import java.util.ArrayList;

public class News {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private ArrayList<Integer> RateList = new ArrayList<Integer>();

    public float getAverageRate() {
        return AverageRate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public ArrayList<Integer> getRateList() {
        return RateList;
    }

    public void setRateList(ArrayList<Integer> rateList) {
        RateList = rateList;
    }

    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("ID: " + ID);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }
    public void InputRate(int rate){
        RateList.add(rate);
        Calculate();
    }
    public void Calculate(){
        float sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        AverageRate = (float) sum / RateList.size();
    }
}
