package lab8;

public abstract class Card {

    protected final String cardType, cardNumber;
    protected final int expMonth, expYear;
    protected boolean validExp, validLength, validPrefix, validChar, validCheckSum, validStanding;

    public Card(String cardType, String cardNumber, int expMonth, int expYear) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }

    final void checkCardValidity() {
        printInfo();
        validExp = isExpiryDateValid();
        validLength = isLengthValid();
        validPrefix = isPrefixValid();
        validChar = isCharValid();
        validCheckSum = isChecksumValid();
        validStanding = isGoodStanding();

        if (validExp && validLength && validPrefix && validChar && validCheckSum && validStanding) {
            System.out.println("This credit card is valid");
        } else {
            System.out.println("This credit card is invalid");
        }
    }

    protected final void printInfo() {
        System.out.println("Card Type: " + cardType);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("ExpiryMonth: " + expMonth + ", ExpiryYear: " + expYear);
    }

    protected boolean isExpiryDateValid() {
        String msg = "Expiry Date";
        boolean valid;

        //Check card expiry date algorithm
        if (expYear > 2018) {
            valid = true;
        } else if (expYear == 2018) {
            valid = expMonth > 11;
        } else {
            valid = false;
        }

        if (!valid) {
            printInvalid(msg);
        }

        return valid;
    }

    protected abstract boolean isLengthValid();

    protected abstract boolean isPrefixValid();

    protected boolean isCharValid() {
        String msg = "Character";
        boolean valid;

        //Check card number has valid character algorithm
        try {
            long parse = Long.parseLong(cardNumber);
            valid = true;
        } catch (NumberFormatException e) {
            valid = false;
        }

        if (!valid) {
            printInvalid(msg);
        }

        return valid;
    }

    protected boolean isChecksumValid() {
        String msg="Checksum";
        boolean valid = true;
        int sum = 0;
        int multiplier = 1;
        int strLen = cardNumber.length();
        for (int i = 0; i < strLen; i++) {
            String digit = cardNumber.substring(strLen - i - 1, strLen - i);
            int currProduct = new Integer(digit).intValue() * multiplier;
            if (currProduct >= 10) {
                sum += (currProduct % 10) + 1;
            } else {
                sum += currProduct;
            }
            if (multiplier == 1) {
                multiplier++;
            } else {
                multiplier--;
            }
        }
        if ((sum % 10) != 0) {
            printInvalid(msg);
            valid = false;
        }
        return valid;
    }

    protected abstract boolean isGoodStanding();

    protected void printInvalid(String msg) {
        System.out.println("Invalid " + msg);
    }
}
