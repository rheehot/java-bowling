package frame;

import java.util.Objects;

public class FrameNumber {
    private static final int NEXT = 1;
    private final Integer number;

    public FrameNumber(Integer number) {
        validateNumber(number);
        this.number = number;
    }

    private void validateNumber(Integer number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(number + "는 올바르지 않은 프레임 번호입니다.");
        }
    }

    public Integer next() {
        return number + NEXT;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrameNumber that = (FrameNumber) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "FrameNumber{" +
                "number=" + number +
                '}';
    }
}
