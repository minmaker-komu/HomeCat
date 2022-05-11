import javax.swing.*;
import java.awt.*;

public class ThreadTimer extends JFrame {
    JLabel time;
    JLabel dayNight;
    JLabel date;
    int min, sec;
    int day=1;
    int n;

    // 타이머 gui 설정
    ThreadTimer(){
        this.setTitle("하루는 2분 입니다.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 타이머 레이아웃 짜기
        Container c = getContentPane();
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        c.setLayout(new GridLayout(2,1));
        MyThread th = new MyThread();
        time = new JLabel();
        dayNight = new JLabel();
        date = new JLabel();

        time.setFont(new Font("Gothic", Font.BOLD, 50));
        dayNight.setFont(new Font("Gothic", Font.PLAIN, 30));
        dayNight.setOpaque(true);
        Color color = new Color(255,0,0);
        dayNight.setForeground(color);
        date.setFont(new Font("Gothic", Font.PLAIN, 30));

        p1.add(date);
        p1.add(dayNight);
        p2.add(time);
        c.add("Center",p1);
        c.add("Center",p2);

        this.setLocationRelativeTo(null);
        this.setSize(300,200);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        th.start();
    }

    /*public int time() {
        return min;
    }*/

    public int day() {
        return day;
    }
    class MyThread extends Thread{
        public void run(){
            n=0;
            while (true){
                n++;
                sec = n%60;
                min = n/60%60;

                if(min==0){
                    dayNight.setText(String.format("낮"));
                }
                if(min==1){
                    dayNight.setText(String.format("밤"));
                }
                if(min==2){
                    n=0;
                    day++;
                }
                date.setText(String.format(day+"일차"));
                time.setText(String.format(min+" : "+sec));
                try{
                    sleep(1000);
                }
                catch (Exception e){
                    return;
                }
            }
        }
    }

}

