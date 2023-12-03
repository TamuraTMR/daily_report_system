package models.validators;

import java.util.ArrayList;
import java.util.List;

import actions.views.ReportView;
import constants.MessageConst;

/**
 * 日報インスタンスに設定されている値のバリデーションを行うクラス
 */
public class ReportValidator {

    /**
     * 日報インスタンスの各項目についてバリデーションを行う
     * @param rv 日報インスタンス
     * @return エラーのリスト
     */
    public static List<String> validate(ReportView rv) {
        List<String> errors = new ArrayList<String>();

      //出勤時間のチェック
        String timeError = validateTime(rv.getTime());
        if (!timeError.equals("")) {
            errors.add(timeError);
        }

      //退勤時間のチェック
        String time2Error = validateTime2(rv.getTime2());
        if (!time2Error.equals("")) {
            errors.add(time2Error);
        }

        //タイトルのチェック
        String titleError = validateTitle(rv.getTitle());
        if (!titleError.equals("")) {
            errors.add(titleError);
        }

        //内容のチェック
        String contentError = validateContent(rv.getContent());
        if (!contentError.equals("")) {
            errors.add(contentError);
        }

        return errors;
    }

    /**
     * 出勤時間に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param time 出勤時間
     * @return エラーメッセージ
     */
    private static String validateTime(String time) {
        if (time == null || time.equals("")) {
            return MessageConst.E_NOTIME.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 退勤時間に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param time2 退勤時間
     * @return エラーメッセージ
     */
    private static String validateTime2(String time2) {
        if (time2 == null || time2.equals("")) {
            return MessageConst.E_NOTIME2.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }


    /**
     * タイトルに入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param title タイトル
     * @return エラーメッセージ
     */
    private static String validateTitle(String title) {
        if (title == null || title.equals("")) {
            return MessageConst.E_NOTITLE.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 内容に入力値があるかをチェックし、入力値がなければエラーメッセージを返却
     * @param content 内容
     * @return エラーメッセージ
     */
    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return MessageConst.E_NOCONTENT.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }
}