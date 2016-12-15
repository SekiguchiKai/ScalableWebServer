package jp.co.topgate.sekiguchi.kai.web.webapp.bulletinboard;

<<<<<<< HEAD

=======
import jp.co.topgate.sekiguchi.kai.web.webserver.Handler;
>>>>>>> develop
import jp.co.topgate.sekiguchi.kai.web.webapp.WebApp;
import jp.co.topgate.sekiguchi.kai.web.webapp.bulletinboard.handler.*;
import jp.co.topgate.sekiguchi.kai.web.webserver.Handler;

/**
 * BulletinBoardアプリケーションを表すクラス
 * Created by sekiguchikai on 2016/12/13.
 */
public class BulletinBoardApp extends WebApp {
    public BulletinBoardApp() {
        super();
    }


    /**
     * WebAppクラスを継承した各クラスに必要なHandlerクラスをインスタンス化し、パスを紐付けるメソッド
     */
    public void initializeHandler() {
        Handler indexHandler = new IndexHandler();
        Handler registerMessageHandler = new RegisterMessageHandler();
        Handler searchMessageHandler = new SearchMessageHandler();
        Handler deleteMessageHandler = new DeleteMessageHandler();


        this.handlerMap.put("/program/board/", indexHandler);
        this.handlerMap.put("/program/board/register/", registerMessageHandler);
        this.handlerMap.put("/program/board/search/", searchMessageHandler);
        this.handlerMap.put("/program/board/delete/", deleteMessageHandler);

    }

}
