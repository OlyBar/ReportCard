public class ReportCard{
    private String lecture;
    private int score;
    private String term;

    public ReportCard(String lecture, int score, String term){
        this.lecture = lecture;
        this.score = score;
        this.term = term;
    }

    @Override
    public String toString(){
        return "ReportCard{" +
                "lecture='" + lecture + '\'' +
                ", score=" + score +
                ", term='" + term + '\'' +
                '}';
    }

    public String getLecture(){
        return lecture;
    }

    public void setLecture(String lecture){
        this.lecture = lecture;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String getTerm(){
        return term;
    }

    public void setTerm(String term){
        this.term = term;
    }

    public String assignScore(int grade){
        String score;

        if(grade > 90 && grade < 101){
            score = "A";
        } else if (grade > 80 && grade < 90){
            score = "B";
        } else if (grade > 70 && grade < 80){
            score = "C";
        } else{
            score = "F";
        }

        return score;
    }

    public String getComment(String score){

        String comment;

        switch(score){
            case "A":
            comment = "Perfect!";
            break;

            case "B":
                comment = "Great!";
                        break;
            case "C":
                comment = "Try harder";
                break;
            default:
                comment = "Unknown";
                break;
        }
        return comment;
    }
}