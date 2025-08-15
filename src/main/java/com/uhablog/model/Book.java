package com.uhablog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data //各フィールドのsetterとgetterを自動で設定
@Entity
@Table(name = "booksinfo") // 対応するテーブルを設定
/* BookクラスはPostgreSQLに作成したbooksinfoテーブルのデータを保持する役割を持っている*/
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //idが自動で生成される値であることを明示
    @Column(name="id") //@Columnでテーブルのどのカラムと対応しているかを設定
    // 本のidを保持するフィールド
    private Integer id;
	
    @Column(name="title")
    // 本のタイトルを保持するフィールド
    private String title;
	
	
    @Column(name="price")
    // 本の値段を保持するフィールド
    private Integer price;
}