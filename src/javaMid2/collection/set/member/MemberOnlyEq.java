package javaMid2.collection.set.member;

import java.util.Objects;

public class MemberOnlyEq {
    private String id;

    public MemberOnlyEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MemberOnlyEq other = (MemberOnlyEq) obj;
        return Objects.equals(this.id, other.id);
    }

    //
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

    @Override
    public String toString() {
        return "MemberOnlyEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
