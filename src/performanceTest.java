public class performanceTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long a = 10000000000L;
        long b = 0;
        for(long i = 0; i< a; i++){
            b+=1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
/**
 * 因为前端已经排不出来了，我的需求就这样一鸽再鸽
 * 在这样惬意的午后，慵懒地靠在我的椅子上。
 * 温暖的阳光，桌上的星冰乐，中原明子的经典专辑
 * 没有什么可以比这更惬意的时刻了吧
 * 因为前端已经排不出来了，我的需求就这样一鸽再鸽
 * 不管世界是多么凄凉与萧条，焦虑与局促
 * 只要沉浸在黄金年代的美梦中
 * 就能享受片刻的悠闲与惬意
 *
 */
