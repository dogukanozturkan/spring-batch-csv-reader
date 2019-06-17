DROP TABLE IF EXISTS records;

CREATE TABLE `records` (`id` INT  NOT NULL AUTO_INCREMENT, `accountId`  VARCHAR(20) NULL, `date`  DATE NULL, `currencyCode` VARCHAR(20)
        NULL, `creditDebit` VARCHAR(20) NULL, `counterAccount` VARCHAR(20) NULL, `description` VARCHAR(20) NULL, `vatRation` DOUBLE NULL,
        `isCredit` VARCHAR(20) NULL, `debitType` VARCHAR(20) NULL, `total` DOUBLE NULL, `gross` DOUBLE NULL,
        `vat` DOUBLE NULL, PRIMARY KEY (`id`));

