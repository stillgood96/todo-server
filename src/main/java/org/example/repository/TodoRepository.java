package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository를 상속하고 generic으로 데이터 베이스의 테이블에 연결될 데이터의 객체인 TodoEntity를
// 두번째에는 해당 객체의 id의 타입인 Long을 넣어준다.
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
