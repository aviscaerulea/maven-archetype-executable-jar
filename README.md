maven-archetype-executable-jar
===
Maven archetype for executable jars by Capsule.

[Capsule](http://www.capsule.io/) で実行可能 Jar を開発する Maven プロジェクトの archetype。

このプロジェクトを `mvn install` または適切な Maven リポジトリに deploy 後、以下のようなコマンドによってプロジェクトを生成できる。

``` plain
$ mvn archetype:generate \
    -DarchetypeGroupId=aviscaerulea \
    -DarchetypeArtifactId=app-singleexecutablejar-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=sample.app \
    -DartifactId=sample \
    -Dversion=1.0.0-SNAPSHOT \
    -DinteractiveMode=false
```
