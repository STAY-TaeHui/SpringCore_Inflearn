package hello.member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceImplTest
{
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join()
    {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //thenn
        Assertions.assertEquals(member,findMember);
    }

    @Test
    void findMember()
    {
    }
}