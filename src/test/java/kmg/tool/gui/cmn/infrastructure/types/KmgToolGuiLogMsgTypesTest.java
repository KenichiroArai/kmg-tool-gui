package kmg.tool.gui.cmn.infrastructure.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * KMGツールGUIログメッセージの種類のテスト<br>
 * <p>
 * Msgは、Messageの略。
 * </p>
 *
 * @author KenichiroArai
 *
 * @since 0.1.1
 *
 * @version 0.1.1
 */
@SuppressWarnings({
    "nls", "static-method"
})
public class KmgToolGuiLogMsgTypesTest {

    /**
     * デフォルトコンストラクタ<br>
     *
     * @since 0.1.1
     */
    public KmgToolGuiLogMsgTypesTest() {

        // 処理なし
    }

    /**
     * get メソッドのテスト - 正常系:基本的な値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGet_normalBasicValue() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.get();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getCode メソッドのテスト - 正常系:コードの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetCode_normalBasicCode() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getCode();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "取得値が一致しません");

    }

    /**
     * getDefault メソッドのテスト - 正常系:デフォルト値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDefault_normalDefaultValue() {

        /* 期待値の定義 */
        final KmgToolGuiLogMsgTypes expected = KmgToolGuiLogMsgTypes.NONE;

        /* 準備 */
        // 準備は不要

        /* テスト対象の実行 */
        final KmgToolGuiLogMsgTypes actual = KmgToolGuiLogMsgTypes.getDefault();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "デフォルト値が一致しません");

    }

    /**
     * getDetail メソッドのテスト - 正常系:詳細情報の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDetail_normalBasicDetail() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDetail();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "詳細情報が一致しません");

    }

    /**
     * getDisplayName メソッドのテスト - 正常系:表示名の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetDisplayName_normalBasicDisplayName() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getDisplayName();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "表示名が一致しません");

    }

    /**
     * getEnum メソッドのテスト - 正常系:存在するキーで取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_normalExistingKey() {

        /* 期待値の定義 */
        final KmgToolGuiLogMsgTypes expected = KmgToolGuiLogMsgTypes.NONE;

        /* 準備 */
        final String key = "NONE";

        /* テスト対象の実行 */
        final KmgToolGuiLogMsgTypes actual = KmgToolGuiLogMsgTypes.getEnum(key);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "存在するキーで取得できること");

    }

    /**
     * getEnum メソッドのテスト - 準正常系:存在しないキーで取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetEnum_semiNonExistingKey() {

        /* 期待値の定義 */
        final KmgToolGuiLogMsgTypes expected = KmgToolGuiLogMsgTypes.NONE;

        /* 準備 */
        final String key = "NON_EXISTING_KEY";

        /* テスト対象の実行 */
        final KmgToolGuiLogMsgTypes actual = KmgToolGuiLogMsgTypes.getEnum(key);

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "存在しないキーの場合はNONEが返されること");

    }

    /**
     * getInitValue メソッドのテスト - 正常系:初期値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetInitValue_normalInitValue() {

        /* 期待値の定義 */
        final KmgToolGuiLogMsgTypes expected = KmgToolGuiLogMsgTypes.NONE;

        /* 準備 */
        // 準備は不要

        /* テスト対象の実行 */
        final KmgToolGuiLogMsgTypes actual = KmgToolGuiLogMsgTypes.getInitValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "初期値が一致しません");

    }

    /**
     * getKey メソッドのテスト - 正常系:キーの取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetKey_normalBasicKey() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getKey();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "キーが一致しません");

    }

    /**
     * getValue メソッドのテスト - 正常系:値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testGetValue_normalBasicValue() {

        /* 期待値の定義 */
        final String expected = "指定無し";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.getValue();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "値が一致しません");

    }

    /**
     * toString メソッドのテスト - 正常系:文字列表現の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testToString_normalBasicString() {

        /* 期待値の定義 */
        final String expected = "NONE";

        /* 準備 */
        final KmgToolGuiLogMsgTypes testType = KmgToolGuiLogMsgTypes.NONE;

        /* テスト対象の実行 */
        final String actual = testType.toString();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual, "文字列表現が一致しません");

    }

    /**
     * values メソッドのテスト - 正常系:全ての値の取得
     *
     * @since 0.1.1
     */
    @Test
    public void testValues_normalAllValues() {

        /* 期待値の定義 */
        final int expected = 4;

        /* 準備 */
        // 準備は不要

        /* テスト対象の実行 */
        final KmgToolGuiLogMsgTypes[] actual = KmgToolGuiLogMsgTypes.values();

        /* 検証の実施 */
        Assertions.assertEquals(expected, actual.length, "全ての値が取得できること");

    }

}
