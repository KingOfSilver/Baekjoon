package Main;

// Main 코드 분석
// 첫번째의 조건 => account 값의 자릿수를 result 에 담아준 후 합을 비교
// 두번째 조건 result 값을 반복하여 money 에서 차감
// => money 값이 모두 0 이면서 result 가 0일 때 혹은 money 가 result 보다 충분히 커야 결과값이 최소화
//91731000
public class Test {
    private static int[] moneyCheckArr = new int[8];

    public static void save(int[] money) {
        System.arraycopy(money, 0, moneyCheckArr, 0, money.length);
    }

    public static void withdraw(int[] account, int[][] result) {
        int[] denominations = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int i = 0; i < account.length; i++) {
            int amount = account[i];
            int[] allocation = new int[8];

            for (int j = 0; j < denominations.length; j++) {
                int needed = amount / denominations[j];
                int available = Math.min(needed, moneyCheckArr[j]);

                allocation[j] = available;
                amount -= available * denominations[j];
                moneyCheckArr[j] -= available;
            }

            // 초과 방지 및 조건 처리
            if (amount > 0) {
                // 금액을 정확히 맞출 수 없는 경우, allocation 초기화
                allocation = new int[8];
            }

            result[i] = allocation;
        }
    }
}
