package com.springboot.relationship.data.repository;

import com.springboot.relationship.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    /* Optional<Product> findByNumber(Long number);

    List<Product> findAllByName(String name);

    Product queryByNumber(Long number);

    // exists...By
    boolean existsByNumber(Long number);

    // count..By
    long countByName(String name);

    // delete... By, remove ... By
    void deleteByNumber(Long number);

    long removeByName(String name);

    // First<number>..., ...top<number>...
    List<Product> findFirst5ByName(String name);

    List<Product> findTop10ByName(String name);

    // findByNumber 메서드와 동일하게 동작
    Product findByNumberIs(Long number);

    Product findByNumberEquals(Long number);

    Product findByNumberIsNot(Long number);

    Product findByNumberNot(Long number);

    List<Product> findByUpdatedAtNull();

    List<Product> findByUpdatedAtIsNull();

    List<Product> findByUpdatedAtNotNull();

    List<Product> findByUpdatedAtIsNotNull();

    // true, false
    Product findByisActiveTrue();

    Product findByisActiveIsTrue();

    Product findByisActiveFalse();

    Product findByActiveIsFalse();

    // findByNumber
    Product findByNumberAndName(Long number, String name);

    Product findByNumberOrName(Long number, String name);

    // GreaterThan, (Is)LessThan, (Is)Between
    List<Product> findByPriceIsGreaterThan(Long price);

    List<Product> findByPriceGreaterThan(Long price);

    List<Product> findByPriceGreaterThanEqual(Long price);

    List<Product> findByPriceIsLessThan(Long price);

    List<Product> findByPriceLessThan(Long price);

    List<Product> findByPriceLessThanEqual(Long price);

    List<Product> findByPriceIsBetween(Long lowPrice, Long highPrice);

    List<Product> findByPriceBetween(Long lowPrice, Long highPrice);

    // (Is)StartingWith(=startsWith), (Is)EndingWith(=EndsWith), (Is)Containing(=Contains), (Is)Like

    List<Product> findByNameLike(String name);

    List<Product> findByNameIsLike(String name);

    List<Product> findByNameContains(String name);

    List<Product> findByNameContaining(String name);

    List<Product> findByNameIsContaining(String name);

    List<Product> findByNameStartsWith(String name);

    List<Product> findByNameStartingWith(String name);

    List<Product> findByNameIsStartingWith(String name);

    List<Product> findByNameEndsWith(String name);

    List<Product> findByNameEndingWith(String name);

    List<Product> findByNameIsEndingWith(String name);

    // ORDER BY Asc, Desc
    List<Product> findByNameOrderByNumberAsc(String name);

    List<Product> findByNameOrderByNumberDesc(String name);

    // And를 붙이지 않음
    List<Product> findByNameOrderByPriceAscStockDesc(String name);

    List<Product> findByName(String name, Sort sort);

    @Query("SELECT p FROM Product AS p WHERE p.name = ?1")
    List<Product> findByName(String name);
    */
}
