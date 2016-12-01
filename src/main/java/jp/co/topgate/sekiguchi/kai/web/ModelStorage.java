package jp.co.topgate.sekiguchi.kai.web;

import java.util.ArrayList;
import java.util.List;

/**
 * Messageインスタンスを格納するためのクラス
 * Created by sekiguchikai on 2016/11/28.
 */
public class ModelStorage {

    /**
     * モデルを格納するためのリスト
     */
    private static List<Model> modelList = new ArrayList<>();
    private static List<Model> tempoList = new ArrayList<>();


    /**
     * モデルを受け取りmodelListに格納するためのメソッド
     *
     * @param model modelListに格納するモデル
     */
    public static void setModelList(Model model) {
        modelList.add(model);
    }

    /**
     * インデックスで指定されたmodelListに格納されたモデルを返すメソッド
     *
     * @param index リストのインデックス
     * @return インデックスで指定されたモデル
     */
    public static Model getModelList(int index) {
        return modelList.get(index);
    }


    /**
     * インデックスで指定されたtempoListに格納されたモデルを返すメソッド
     *
     * @param index リストのインデックス
     * @return インデックスで指定されたモデル
     */
    public static Model getTempoList(int index) {
        return tempoList.get(index);
    }


    /**
     * modelListのサイズを返すメソッド
     *
     * @return modelListのサイズ
     */
    public static int countModel() {
        return modelList.size();
    }


    /**
     * tempoListのサイズを返すメソッド
     *
     * @return tempoListのサイズ
     */
    public static int countTempo() {
        return tempoList.size();
    }


    /**
     * インデックスで指定されたモデルを削除するメソッド
     *
     * @param index リストのインデックス
     */
    public static void removeModel(int index) {
        modelList.remove(index);
    }


    public static void setTempoList() {
        tempoList = modelList;
    }

    /**
     * 指定されたユーザーネームのモデルのみ格納するListを生成
     *
     * @param name ユーザーネーム
     */
    public static void searchModel(String name) {
        removeAllTempo();
        for (int i = 0; i < modelList.size(); i++) {
            if ((modelList.get(i).getName().equals(name))) {
                tempoList.add(modelList.get(i));
            }
        }
    }

    /**
     * modelListに保持している全てのインスタンスを削除するメソッド
     */
    public static void removeAllModel() {
        for (int i = 0; i <= modelList.size(); i++) {
            if (i == modelList.size()) {
                break;
            }
            modelList.remove(i);
        }
    }


    /**
     * tempoListに保持している全てのインスタンスを削除するメソッド
     */
    public static void removeAllTempo() {

        for (int i = 0; i <= tempoList.size(); i++) {
            if (i == tempoList.size()) {
                break;
            }
            tempoList.remove(i);
        }
    }

}
