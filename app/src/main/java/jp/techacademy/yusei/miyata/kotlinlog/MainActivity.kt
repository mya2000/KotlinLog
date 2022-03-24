package jp.techacademy.yusei.miyata.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human = Human("ジョン",13,"ラジコン")
        val human2 = Human("たけし",18,"チェス")

        human.say()
        human2.say()

        human.think()
        human2.think()

        //val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        //dog.move()

        //dog.say()  // ポチが吠えます（ログ出力）
        //Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        //Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        //val dog2 = Dog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        //dog2.say()  // ハチが吠えます（ログ出力）
        //Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        //Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")

        //val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        //bigdog.say()
        //Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        //Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        //Log.d("kotlintest", "ログへの出力テスト")

        //for (i in 1 until 6) {
         //   Log.d("kotlintest", "for文の" + i + "回目")
        //}

        //var num = 1

        //while (num < 6) {
        //    Log.d("kotlintest", "while文の" + num + "回目")
        //    num ++
        //}

        // Array<Int>型の配列が作成される
        //val points = arrayOf(10, 6, 15, 23, 17)

        //for (i in points) {
        //    Log.d("kotlintest", i.toString())
        //}

        //val numA = 100
        //val numB = 0
        //var ans = 0

        //try{
        //    ans = numA / numB
        //} catch (e : Exception) {
        //    Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
        //    Log.d("kotlintest", e.message.toString())
        //} finally {
        //    Log.d("kotlintest", "ans = " + ans.toString())
        //}


        // 引数に50と1000を指定してtotal関数を呼び出す
        //total(50, 1000)
        // 引数の値を変えることで処理内容を簡単に変更できる
        //total(1, 1111)

        //val t = total(50, 1000)   // ここでtotalからsumを返してもらう
        //Log.d("kotlintest", t.toString())
    }
    // firstとlast、2つの引数を指定する
    //private fun total(first: Int, last: Int): Int {
    //    var sum = 0
    //    for (i in first..last) {
    //        sum += i
    //    }

    //    return sum
    //}
}