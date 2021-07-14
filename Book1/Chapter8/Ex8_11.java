package com.nappy.Book1.Chapter8;

class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 :" + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보후 재시도");
        } catch (MemoryException me) {
            System.out.println("에러 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 시도하세요");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치공간부족");
        if (!enoughMemory())
            throw new MemoryException("메모리부족");
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}