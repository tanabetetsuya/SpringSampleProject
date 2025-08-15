package com.uhablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uhablog.model.Book;

/* JpaRepositoryインターフェースを継承することで、以下のような基本的なデータの取得するメソッドを自動で作成してくれる。
 * データの取得
 * データの挿入
 * データの更新
 * データの削除
 */
/* Bookクラスを操作するためのRepositoryを作成するため、JpaRepository<Book, Integer>としている。
 * IntegerはBookクラスのIDの型を指定している。
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
	

}