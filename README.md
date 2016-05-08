# study-designpattern
デザインパターンの学習用

## 設計原則

### アプリケーション内の変化する部分を特定し、不変な部分と分離する。
変化する部分を取り出し「カプセル化」することで、その部分はコードのほかの部分に影響を及ぼさなくなる。

### 実装に対してではなく、インタフェースに対してプログラミングする。

### 継承よりコンポジションを好む。
「HAS-A」は「IS-A」より優れている場合がある。

### 相互にやり取りするオブジェクト間には、疎結合設計を使用するようにする。

### 開放／閉鎖原則（Open-Closed Principle）
クラスは拡張に対しては開かれた状態であるべきだが、変更に対しては閉じた状態であるべき。
既存コードを変更することなく拡張できるようでないといけない。

### 依存性反転の原則（Dependency Inversion Principle）
抽象に依存する。具象クラスに依存してはいけない。

＜理想＞
* 具象クラスへの参照を保持する変数を持たない。
* 具象クラスからクラスを継承しない。
* どのベースクラスの実装済みのメソッドもオーバーライドしない。

### 最少知識の原則（Principle of Least Knowledge）
オブジェクト間のやり取りを、少数の身近な「友達」だけに減らすようにする。

### ハリウッド原則（Hollywood Principle）
こちらを呼び出さないでください。こちらから呼び出します。
依存性の腐敗を回避する。

### クラスは、変更される理由を１つだけ持つべきである。


## デザインパターン

### Strategy
一連のアルゴリズムを定義し、それぞれをカプセル化してそれらを交換可能にします。
これにより、アルゴリズムを使用するクライアントとは独立して、アルゴリズムを変更できます。
★アルゴリズムを持つクラスをクライアントに対してHAS-Aさせる。

### Observer
オブジェクト間の１対多の依存関係を定義し、あるオブジェクトの状態が変化すると、それに依存しているすべてのオブジェクトが自動的に通知され更新されるようにします。
★サブジェクトに対して通知が必要なオブザーバをHAS-Aさせて、サブジェクトの状態変更時に保持するオブザーバにブロードキャストする。

### Decorator
オブジェクトに付加的な責務を動的に付与します。デコレータは、サブクラスかの代替となる、柔軟な機能拡張手段を提供します。
★ベースのクラスをHAS-Aでラップしてベースの処理の呼び出し前後に必要に応じて処理を追加する。

### Factory Method
オブジェクト作成のためのインタフェースを定義しますが、どのクラスをインスタンス化するかについてはサブクラスに決定させます。

### Abstract Factory
具象クラスを指定することなく、一連の関連オブジェクトや依存オブジェクトを作成するためのインタフェースを提供します。
★クライアントは使用するファクトリを選ぶだけで一連のオブジェクトが手に入る。

### Singleton
クラスがインスタンスを１つしか持たないことを保証し、そのインスタンスをアクセスするグローバルポイントを提供します。

### Command
リクエストをオブジェクトとしてカプセル化し、その結果、他のオブジェクトを異なるリクエスト、キュー、またはログリクエストでパラメータ化でき、アンドゥ可能な操作もサポートします。
★インボーカに対してコマンド（＝リクエスト）をセットする。その際、コマンドにはレシーバをセットしておくことで、インボーカがコマンド実行時に、実際のリクエストに対する処理をレシーバに任せることができる。こうすると、”リクエスト”とそれに対する”操作”を組み合わせで処理できる。

### Adapter
クラスのインタフェースをクライアントが期待する別のインタフェースに変換します。
アダプタは、互換性のないインタフェースのためにそのままでは連携できないクラスを連携させます。
★クライアントが実際使うインタフェースであるアダプターは、本来使いたいインタフェースであるアダプティーをHAS-Aして処理を単に受け渡す。

### Facade
サブシステムの一連のインタフェースに対する、統合されたインタフェースを提供します。
ファサードは、サブシステムをより使いやすくする高水準インタフェースを定義します。

### Template Method
メソッドにおけるアルゴリズムの骨組みを定義し、いくつかの手順をサブクラスに先送りします。

### Iterator
内部表現を公開することなくアグリゲートオブジェクトの要素に順次アクセスする方法を提供します。

