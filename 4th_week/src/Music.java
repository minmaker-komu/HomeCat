import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

public class Music extends Thread {

    private Player player;
    private boolean isLoop;// 곡이 무한반복인지 한번만 재생되는지 설정
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    public Music(String name, boolean isLoop) {//생성자
        // 곡의 제목과 무한반복인지의 유무
        try {// 예외처리
            this.isLoop = isLoop;
            //file = new File("C:/Users/minyeong/Desktop/mp3/"+name);
            file = new File((Main.class.getResource("./music/" + name)).toURI());
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);

        }catch(Exception e) {// 오류 발생 시
            System.out.println(e.getMessage());
        }
    }


    public void close() { // 음악 종료
        isLoop = false;
        player.close();
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            do {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play(); //곡 실행

            }while(isLoop);//isLoop가 true이면 무한반복

        }catch(Exception e) {// 오류 발생 시
            System.out.println(e.getMessage());
        }
    }
}
