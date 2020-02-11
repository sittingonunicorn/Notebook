package controller;

public interface regExes {
    public static final String LASTNAME_REGEX_LAT = "[A-Z][a-z]{1,20}";
    public static final String LASTNAME_REGEX_UA = "[А-ЩҐЄІЇЮЯ][а-щґєіїьюя']{1,19}[а-щґєіїьюя]";
    public static final String NICKNAME_REGEX = "[A-Za-z0-9-_]{1,20}";
}
