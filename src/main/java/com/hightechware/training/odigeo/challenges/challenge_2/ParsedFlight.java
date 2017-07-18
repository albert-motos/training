package com.hightechware.training.odigeo.challenges.challenge_2;

import static com.hightechware.training.odigeo.challenges.challenge_2.AbstractFlightRecommendationParser.CACHE_DELAY;

class ParsedFlight {

    private final int price;
    private final String outboundFlight;
    private final String inboundFlight;

    ParsedFlight(int price, String outboundFlight, String inboundFlight) {
        this.price = price;
        this.outboundFlight = outboundFlight;
        this.inboundFlight = inboundFlight;
        getCachedInfo();
    }

    private void getCachedInfo() {
        try {
            Thread.sleep(CACHE_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return price + "€ , [" + outboundFlight + ", " + inboundFlight + "]";
    }

}
