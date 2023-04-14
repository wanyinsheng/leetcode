package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/4/13 10:38
 * @Version 1.0
 **/
public class 获取最大软件版本号 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String version1 = scanner.nextLine();
        String version2 = scanner.nextLine();
        Version v1 = parseVersion(version1);
        Version v2 = parseVersion(version2);
        int compareValue = v1.compareTo(v2);
        String res = "";
        if (compareValue == 0) {
            res = version1.length() > version2.length() ? version1 : version2;
        } else {
            res = compareValue > 0 ? version1 : version2;
        }
        System.out.println(res);


    }

    private static class Version implements Comparable<Version> {
        int mainVersion;
        int secondVersion;
        int addVersion;
        String milVersion = "";

        @Override
        public int compareTo(Version o) {
            if (this.mainVersion != o.mainVersion) {
                return this.mainVersion - o.mainVersion;
            } else if (this.secondVersion != o.secondVersion) {
                return this.secondVersion - o.secondVersion;
            } else if (this.addVersion != o.addVersion) {
                return this.addVersion - o.addVersion;
            } else {
                return this.milVersion.compareTo(o.milVersion);
            }

        }
    }

    private static Version parseVersion(String version) {
        String[] split = version.split("\\.");
        Version version1 = new Version();
        version1.mainVersion = Integer.parseInt(split[0]);
        version1.secondVersion = Integer.parseInt(split[1]);
        if (split.length > 2) {
            String[] str = split[2].split("-");
            version1.addVersion = Integer.parseInt(str[0]);
            if (str.length > 1) {
                version1.milVersion = str[1];
            }
        }
        return version1;
    }
}
