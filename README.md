# KMG ツール GUI（kmg-tool-gui）

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![JavaFX](https://img.shields.io/badge/JavaFX-21-blue.svg)](https://openjfx.io/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen.svg)](https://github.com/your-username/kmg-tool-gui)

KMG ツール GUI は、Java 開発における様々な自動化処理を提供する JavaFX ベースの GUI ツール集です。

## 概要

KMG ツール GUI は、Java 開発の効率化を目的として開発された GUI ツール群です。直感的なグラフィカルユーザーインターフェースを通じて、データベース開発や SQL 生成などの作業を効率化します。

## ドキュメント

詳細なドキュメントは [docs/](docs/) ディレクトリに格納されています。

- **操作手順書**: 各ツールの操作方法（[操作手順書一覧](docs/README.md#操作手順書)）
- **Javadoc**: API ドキュメント（[docs/javadoc/](docs/javadoc/)）

## 主な機能

### SQL 生成ツール

- **挿入 SQL 作成ツール（IS）**: データベーステーブル定義から INSERT 文を自動生成
  - 直感的な GUI による操作
  - ファイル選択機能
  - リアルタイムプレビュー

## プロジェクト構成

```text
kmg-tool-gui/
├── docs/                          # ドキュメント
│   ├── README.md                  # ドキュメント概要
│   ├── javadoc/                   # Javadoc API ドキュメント
│   └── 操作手順書/                # 各ツールの操作手順書
├── src/                           # ソースコード
│   ├── main/java/kmg/tool/gui/    # メインソースコード
│   │   ├── cmn/                   # 共通機能（GUI部品）
│   │   │   └── presentation/      # プレゼンテーション層
│   │   │       └── ui/gui/        # GUI UI
│   │   │           └── stage/     # ステージラッパー
│   │   │               └── wrapper/  # ファイル/ディレクトリ選択ラッパー
│   │   └── is/                    # 挿入SQL作成ツール
│   │       └── presentation/      # プレゼンテーション層
│   │           └── ui/gui/        # GUI UI
│   │               ├── controller/ # JavaFXコントローラー
│   │               └── IsCreationTool.java  # メインアプリケーション
│   ├── main/resources/            # リソースファイル
│   │   ├── application.properties
│   │   ├── kmg-tool-gui-messages.properties
│   │   ├── kmg-tool-gui-messages-val.properties
│   │   ├── kmg-tool-gui-messages-log.properties
│   │   ├── logback-kmg-tool-gui.xml
│   │   └── fxml/                  # FXML ファイル
│   └── test/                      # テストコード
│       └── java/kmg/tool/gui/     # テストソースコード
├── target/                        # ビルド成果物
├── logs/                          # ログファイル
├── bin/                           # バイナリファイル
├── pom.xml                        # Maven設定ファイル
├── LICENSE                        # ライセンスファイル
└── README.md                      # プロジェクト概要
```

### 主要パッケージ構成

- **cmn**: 共通機能（GUI 部品、ファイル選択ダイアログラッパー）
- **is**: 挿入 SQL 作成ツール（INSERT 文自動生成）

## セットアップ

### 前提条件

- Java 21 以上
- JavaFX 21 以上
- Maven 3.6 以上

### インストール

1. リポジトリをクローンします：

   ```bash
   git clone https://github.com/KenichiroArai/kmg-tool-gui.git
   cd kmg-tool-gui
   ```

2. Maven を使用してビルドします：

   ```bash
   mvn clean install
   ```

## 使用方法

各ツールは個別に実行可能で、Maven を使用して以下のように実行できます：

```bash
# 挿入SQL作成ツールの実行
mvn javafx:run

# または
mvn exec:java -Dexec.mainClass="kmg.tool.gui.is.presentation.ui.gui.IsCreationTool"
```

詳細な使用方法については、[docs/操作手順書/](docs/操作手順書/) を参照してください。

## 貢献

プロジェクトへの貢献を歓迎します！以下の手順で貢献できます：

1. このリポジトリをフォークします
2. フィーチャーブランチを作成します (`git checkout -b feature/amazing-feature`)
3. 変更をコミットします (`git commit -m 'Add some amazing feature'`)
4. ブランチにプッシュします (`git push origin feature/amazing-feature`)
5. プルリクエストを作成します

## 問題の報告

バグを発見した場合や機能要求がある場合は、[Issues](https://github.com/KenichiroArai/kmg-tool-gui/issues) で報告してください。

## ライセンス

このプロジェクトは MIT ライセンスの下で公開されています。詳細は[LICENSE](LICENSE)ファイルを参照してください。
