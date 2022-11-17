package lotto.View;

import camp.nextstep.edu.missionutils.Console;
public class InputView {
    final static String INPUT_ERROR_MSG = "[ERROR] 로또는 1000원이오니, 1000원 단위로 판매하고 있습니다.";

    public static int getPriceForLotto() {
        int priceOfLotto = Integer.parseInt(Console.readLine());

        validateCanBuy(priceOfLotto);

        System.out.println(priceOfLotto);

        return priceOfLotto;
    }

    private static int validateCanBuy(int priceOfLotto) {
        if (priceOfLotto < 1000) {
            System.out.println(INPUT_ERROR_MSG);
            throw new IllegalArgumentException();
        }

        return validatePriceForLotto(priceOfLotto);
    }

    private static int validatePriceForLotto(int priceOfLotto) {
        if (priceOfLotto % 1000 != 0){
            System.out.println(INPUT_ERROR_MSG);
            throw new IllegalArgumentException();
        }

        return priceOfLotto;
    }


}
