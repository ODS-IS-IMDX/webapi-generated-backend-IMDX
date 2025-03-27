package net.ouranos.adaptor.digiline;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

/**
 * Adaptorインターフェースは、データモデルに対してGET、PUT、およびDELETEリクエストを送信するためのメソッドを定義します。
 *
 * @param <T> データモデルの型
 */
public interface Adaptor<T> {

    /**
     * 指定されたデータモデルに対してGETリクエストを送信します。
     *
     * @param targetDataModel 取得対象のデータモデル
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    ResponseEntity<T> sendGet(String targetDataModel, UUID tracking, String queryParam, String token);

    /**
     * 指定されたデータモデルに対してPUTリクエストを送信します。
     *
     * @param dataModelTemplate 送信するデータモデル
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    ResponseEntity<T> sendPut(T dataModelTemplate, UUID tracking, String queryParam, String token);
        
    /**
     * 指定されたデータモデルに対してDELETEリクエストを送信します。
     *
     * @param id 削除対象のデータモデルのデータID
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    ResponseEntity<Void> sendDelete(UUID tracking, String queryParam, String token);

    /**
     * 指定されたデータモデルに対してPOSTリクエストを送信します。
     * デフォルトではExceptionをスローするため、POSTを利用するAPIは実装クラスでオーバーライドしてください。
     *
     * @param dataModelTemplate 送信するデータモデル
     * @param tracking トラッキングID
     * @return サーバーからのレスポンス
     */
    default ResponseEntity<T> sendPost(T dataModelTemplate, UUID tracking, String queryParam, String token){
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
