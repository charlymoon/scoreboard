/**
 * Game.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.delunasaenz.scoreboard;

public class Game  implements java.io.Serializable {
    private java.lang.String ampm;

    private java.lang.String aw_lg_ampm;

    private java.lang.String away_ampm;

    private java.lang.String away_code;

    private java.lang.String away_division;

    private java.lang.String away_file_code;

    private java.lang.String away_league_id;

    private java.lang.String away_loss;

    private java.lang.String away_name_abbrev;

    private java.lang.String away_sport_code;

    private java.lang.String away_team_city;

    private java.lang.String away_team_errors;

    private java.lang.String away_team_hits;

    private java.lang.String away_team_id;

    private java.lang.String away_team_link;

    private java.lang.String away_team_name;

    private java.lang.String away_team_runs;

    private java.lang.String away_time;

    private java.lang.String away_time_zone;

    private java.lang.String away_win;

    private java.lang.String box_link;

    private java.lang.String day;

    private int game_pk;

    private java.lang.String game_type;

    private java.lang.String gameday_link;

    private java.lang.String gameday_sw;

    private java.lang.String hm_lg_ampm;

    private java.lang.String home_ampm;

    private java.lang.String home_code;

    private java.lang.String home_division;

    private java.lang.String home_file_code;

    private java.lang.String home_league_id;

    private java.lang.String home_loss;

    private java.lang.String home_name_abbrev;

    private java.lang.String home_sport_code;

    private java.lang.String home_team_city;

    private java.lang.String home_team_errors;

    private java.lang.String home_team_hits;

    private java.lang.String home_team_id;

    private java.lang.String home_team_link;

    private java.lang.String home_team_name;

    private java.lang.String home_team_runs;

    private java.lang.String home_time;

    private java.lang.String home_time_zone;

    private java.lang.String home_win;

    private java.lang.String id;

    private java.lang.String ind;

    private java.lang.String inning;

    private java.lang.String league;

    private java.lang.String outs;

    private java.lang.String runner_on_base_status;

    private java.lang.String scheduled_innings;

    private java.lang.String status;

    private java.lang.String time;

    private java.lang.String time_aw_lg;

    private java.lang.String time_hm_lg;

    private java.lang.String time_zone;

    private java.lang.String time_zone_aw_lg;

    private java.lang.String time_zone_hm_lg;

    private java.lang.String top_inning;

    private java.lang.String tz_aw_lg_gen;

    private java.lang.String tz_hm_lg_gen;

    private java.lang.String venue;

    private java.lang.String venue_id;

    private java.lang.String venue_w_chan_loc;

    public Game() {
    }

    public Game(
           java.lang.String ampm,
           java.lang.String aw_lg_ampm,
           java.lang.String away_ampm,
           java.lang.String away_code,
           java.lang.String away_division,
           java.lang.String away_file_code,
           java.lang.String away_league_id,
           java.lang.String away_loss,
           java.lang.String away_name_abbrev,
           java.lang.String away_sport_code,
           java.lang.String away_team_city,
           java.lang.String away_team_errors,
           java.lang.String away_team_hits,
           java.lang.String away_team_id,
           java.lang.String away_team_link,
           java.lang.String away_team_name,
           java.lang.String away_team_runs,
           java.lang.String away_time,
           java.lang.String away_time_zone,
           java.lang.String away_win,
           java.lang.String box_link,
           java.lang.String day,
           int game_pk,
           java.lang.String game_type,
           java.lang.String gameday_link,
           java.lang.String gameday_sw,
           java.lang.String hm_lg_ampm,
           java.lang.String home_ampm,
           java.lang.String home_code,
           java.lang.String home_division,
           java.lang.String home_file_code,
           java.lang.String home_league_id,
           java.lang.String home_loss,
           java.lang.String home_name_abbrev,
           java.lang.String home_sport_code,
           java.lang.String home_team_city,
           java.lang.String home_team_errors,
           java.lang.String home_team_hits,
           java.lang.String home_team_id,
           java.lang.String home_team_link,
           java.lang.String home_team_name,
           java.lang.String home_team_runs,
           java.lang.String home_time,
           java.lang.String home_time_zone,
           java.lang.String home_win,
           java.lang.String id,
           java.lang.String ind,
           java.lang.String inning,
           java.lang.String league,
           java.lang.String outs,
           java.lang.String runner_on_base_status,
           java.lang.String scheduled_innings,
           java.lang.String status,
           java.lang.String time,
           java.lang.String time_aw_lg,
           java.lang.String time_hm_lg,
           java.lang.String time_zone,
           java.lang.String time_zone_aw_lg,
           java.lang.String time_zone_hm_lg,
           java.lang.String top_inning,
           java.lang.String tz_aw_lg_gen,
           java.lang.String tz_hm_lg_gen,
           java.lang.String venue,
           java.lang.String venue_id,
           java.lang.String venue_w_chan_loc) {
           this.ampm = ampm;
           this.aw_lg_ampm = aw_lg_ampm;
           this.away_ampm = away_ampm;
           this.away_code = away_code;
           this.away_division = away_division;
           this.away_file_code = away_file_code;
           this.away_league_id = away_league_id;
           this.away_loss = away_loss;
           this.away_name_abbrev = away_name_abbrev;
           this.away_sport_code = away_sport_code;
           this.away_team_city = away_team_city;
           this.away_team_errors = away_team_errors;
           this.away_team_hits = away_team_hits;
           this.away_team_id = away_team_id;
           this.away_team_link = away_team_link;
           this.away_team_name = away_team_name;
           this.away_team_runs = away_team_runs;
           this.away_time = away_time;
           this.away_time_zone = away_time_zone;
           this.away_win = away_win;
           this.box_link = box_link;
           this.day = day;
           this.game_pk = game_pk;
           this.game_type = game_type;
           this.gameday_link = gameday_link;
           this.gameday_sw = gameday_sw;
           this.hm_lg_ampm = hm_lg_ampm;
           this.home_ampm = home_ampm;
           this.home_code = home_code;
           this.home_division = home_division;
           this.home_file_code = home_file_code;
           this.home_league_id = home_league_id;
           this.home_loss = home_loss;
           this.home_name_abbrev = home_name_abbrev;
           this.home_sport_code = home_sport_code;
           this.home_team_city = home_team_city;
           this.home_team_errors = home_team_errors;
           this.home_team_hits = home_team_hits;
           this.home_team_id = home_team_id;
           this.home_team_link = home_team_link;
           this.home_team_name = home_team_name;
           this.home_team_runs = home_team_runs;
           this.home_time = home_time;
           this.home_time_zone = home_time_zone;
           this.home_win = home_win;
           this.id = id;
           this.ind = ind;
           this.inning = inning;
           this.league = league;
           this.outs = outs;
           this.runner_on_base_status = runner_on_base_status;
           this.scheduled_innings = scheduled_innings;
           this.status = status;
           this.time = time;
           this.time_aw_lg = time_aw_lg;
           this.time_hm_lg = time_hm_lg;
           this.time_zone = time_zone;
           this.time_zone_aw_lg = time_zone_aw_lg;
           this.time_zone_hm_lg = time_zone_hm_lg;
           this.top_inning = top_inning;
           this.tz_aw_lg_gen = tz_aw_lg_gen;
           this.tz_hm_lg_gen = tz_hm_lg_gen;
           this.venue = venue;
           this.venue_id = venue_id;
           this.venue_w_chan_loc = venue_w_chan_loc;
    }


    /**
     * Gets the ampm value for this Game.
     * 
     * @return ampm
     */
    public java.lang.String getAmpm() {
        return ampm;
    }


    /**
     * Sets the ampm value for this Game.
     * 
     * @param ampm
     */
    public void setAmpm(java.lang.String ampm) {
        this.ampm = ampm;
    }


    /**
     * Gets the aw_lg_ampm value for this Game.
     * 
     * @return aw_lg_ampm
     */
    public java.lang.String getAw_lg_ampm() {
        return aw_lg_ampm;
    }


    /**
     * Sets the aw_lg_ampm value for this Game.
     * 
     * @param aw_lg_ampm
     */
    public void setAw_lg_ampm(java.lang.String aw_lg_ampm) {
        this.aw_lg_ampm = aw_lg_ampm;
    }


    /**
     * Gets the away_ampm value for this Game.
     * 
     * @return away_ampm
     */
    public java.lang.String getAway_ampm() {
        return away_ampm;
    }


    /**
     * Sets the away_ampm value for this Game.
     * 
     * @param away_ampm
     */
    public void setAway_ampm(java.lang.String away_ampm) {
        this.away_ampm = away_ampm;
    }


    /**
     * Gets the away_code value for this Game.
     * 
     * @return away_code
     */
    public java.lang.String getAway_code() {
        return away_code;
    }


    /**
     * Sets the away_code value for this Game.
     * 
     * @param away_code
     */
    public void setAway_code(java.lang.String away_code) {
        this.away_code = away_code;
    }


    /**
     * Gets the away_division value for this Game.
     * 
     * @return away_division
     */
    public java.lang.String getAway_division() {
        return away_division;
    }


    /**
     * Sets the away_division value for this Game.
     * 
     * @param away_division
     */
    public void setAway_division(java.lang.String away_division) {
        this.away_division = away_division;
    }


    /**
     * Gets the away_file_code value for this Game.
     * 
     * @return away_file_code
     */
    public java.lang.String getAway_file_code() {
        return away_file_code;
    }


    /**
     * Sets the away_file_code value for this Game.
     * 
     * @param away_file_code
     */
    public void setAway_file_code(java.lang.String away_file_code) {
        this.away_file_code = away_file_code;
    }


    /**
     * Gets the away_league_id value for this Game.
     * 
     * @return away_league_id
     */
    public java.lang.String getAway_league_id() {
        return away_league_id;
    }


    /**
     * Sets the away_league_id value for this Game.
     * 
     * @param away_league_id
     */
    public void setAway_league_id(java.lang.String away_league_id) {
        this.away_league_id = away_league_id;
    }


    /**
     * Gets the away_loss value for this Game.
     * 
     * @return away_loss
     */
    public java.lang.String getAway_loss() {
        return away_loss;
    }


    /**
     * Sets the away_loss value for this Game.
     * 
     * @param away_loss
     */
    public void setAway_loss(java.lang.String away_loss) {
        this.away_loss = away_loss;
    }


    /**
     * Gets the away_name_abbrev value for this Game.
     * 
     * @return away_name_abbrev
     */
    public java.lang.String getAway_name_abbrev() {
        return away_name_abbrev;
    }


    /**
     * Sets the away_name_abbrev value for this Game.
     * 
     * @param away_name_abbrev
     */
    public void setAway_name_abbrev(java.lang.String away_name_abbrev) {
        this.away_name_abbrev = away_name_abbrev;
    }


    /**
     * Gets the away_sport_code value for this Game.
     * 
     * @return away_sport_code
     */
    public java.lang.String getAway_sport_code() {
        return away_sport_code;
    }


    /**
     * Sets the away_sport_code value for this Game.
     * 
     * @param away_sport_code
     */
    public void setAway_sport_code(java.lang.String away_sport_code) {
        this.away_sport_code = away_sport_code;
    }


    /**
     * Gets the away_team_city value for this Game.
     * 
     * @return away_team_city
     */
    public java.lang.String getAway_team_city() {
        return away_team_city;
    }


    /**
     * Sets the away_team_city value for this Game.
     * 
     * @param away_team_city
     */
    public void setAway_team_city(java.lang.String away_team_city) {
        this.away_team_city = away_team_city;
    }


    /**
     * Gets the away_team_errors value for this Game.
     * 
     * @return away_team_errors
     */
    public java.lang.String getAway_team_errors() {
        return away_team_errors;
    }


    /**
     * Sets the away_team_errors value for this Game.
     * 
     * @param away_team_errors
     */
    public void setAway_team_errors(java.lang.String away_team_errors) {
        this.away_team_errors = away_team_errors;
    }


    /**
     * Gets the away_team_hits value for this Game.
     * 
     * @return away_team_hits
     */
    public java.lang.String getAway_team_hits() {
        return away_team_hits;
    }


    /**
     * Sets the away_team_hits value for this Game.
     * 
     * @param away_team_hits
     */
    public void setAway_team_hits(java.lang.String away_team_hits) {
        this.away_team_hits = away_team_hits;
    }


    /**
     * Gets the away_team_id value for this Game.
     * 
     * @return away_team_id
     */
    public java.lang.String getAway_team_id() {
        return away_team_id;
    }


    /**
     * Sets the away_team_id value for this Game.
     * 
     * @param away_team_id
     */
    public void setAway_team_id(java.lang.String away_team_id) {
        this.away_team_id = away_team_id;
    }


    /**
     * Gets the away_team_link value for this Game.
     * 
     * @return away_team_link
     */
    public java.lang.String getAway_team_link() {
        return away_team_link;
    }


    /**
     * Sets the away_team_link value for this Game.
     * 
     * @param away_team_link
     */
    public void setAway_team_link(java.lang.String away_team_link) {
        this.away_team_link = away_team_link;
    }


    /**
     * Gets the away_team_name value for this Game.
     * 
     * @return away_team_name
     */
    public java.lang.String getAway_team_name() {
        return away_team_name;
    }


    /**
     * Sets the away_team_name value for this Game.
     * 
     * @param away_team_name
     */
    public void setAway_team_name(java.lang.String away_team_name) {
        this.away_team_name = away_team_name;
    }


    /**
     * Gets the away_team_runs value for this Game.
     * 
     * @return away_team_runs
     */
    public java.lang.String getAway_team_runs() {
        return away_team_runs;
    }


    /**
     * Sets the away_team_runs value for this Game.
     * 
     * @param away_team_runs
     */
    public void setAway_team_runs(java.lang.String away_team_runs) {
        this.away_team_runs = away_team_runs;
    }


    /**
     * Gets the away_time value for this Game.
     * 
     * @return away_time
     */
    public java.lang.String getAway_time() {
        return away_time;
    }


    /**
     * Sets the away_time value for this Game.
     * 
     * @param away_time
     */
    public void setAway_time(java.lang.String away_time) {
        this.away_time = away_time;
    }


    /**
     * Gets the away_time_zone value for this Game.
     * 
     * @return away_time_zone
     */
    public java.lang.String getAway_time_zone() {
        return away_time_zone;
    }


    /**
     * Sets the away_time_zone value for this Game.
     * 
     * @param away_time_zone
     */
    public void setAway_time_zone(java.lang.String away_time_zone) {
        this.away_time_zone = away_time_zone;
    }


    /**
     * Gets the away_win value for this Game.
     * 
     * @return away_win
     */
    public java.lang.String getAway_win() {
        return away_win;
    }


    /**
     * Sets the away_win value for this Game.
     * 
     * @param away_win
     */
    public void setAway_win(java.lang.String away_win) {
        this.away_win = away_win;
    }


    /**
     * Gets the box_link value for this Game.
     * 
     * @return box_link
     */
    public java.lang.String getBox_link() {
        return box_link;
    }


    /**
     * Sets the box_link value for this Game.
     * 
     * @param box_link
     */
    public void setBox_link(java.lang.String box_link) {
        this.box_link = box_link;
    }


    /**
     * Gets the day value for this Game.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this Game.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the game_pk value for this Game.
     * 
     * @return game_pk
     */
    public int getGame_pk() {
        return game_pk;
    }


    /**
     * Sets the game_pk value for this Game.
     * 
     * @param game_pk
     */
    public void setGame_pk(int game_pk) {
        this.game_pk = game_pk;
    }


    /**
     * Gets the game_type value for this Game.
     * 
     * @return game_type
     */
    public java.lang.String getGame_type() {
        return game_type;
    }


    /**
     * Sets the game_type value for this Game.
     * 
     * @param game_type
     */
    public void setGame_type(java.lang.String game_type) {
        this.game_type = game_type;
    }


    /**
     * Gets the gameday_link value for this Game.
     * 
     * @return gameday_link
     */
    public java.lang.String getGameday_link() {
        return gameday_link;
    }


    /**
     * Sets the gameday_link value for this Game.
     * 
     * @param gameday_link
     */
    public void setGameday_link(java.lang.String gameday_link) {
        this.gameday_link = gameday_link;
    }


    /**
     * Gets the gameday_sw value for this Game.
     * 
     * @return gameday_sw
     */
    public java.lang.String getGameday_sw() {
        return gameday_sw;
    }


    /**
     * Sets the gameday_sw value for this Game.
     * 
     * @param gameday_sw
     */
    public void setGameday_sw(java.lang.String gameday_sw) {
        this.gameday_sw = gameday_sw;
    }


    /**
     * Gets the hm_lg_ampm value for this Game.
     * 
     * @return hm_lg_ampm
     */
    public java.lang.String getHm_lg_ampm() {
        return hm_lg_ampm;
    }


    /**
     * Sets the hm_lg_ampm value for this Game.
     * 
     * @param hm_lg_ampm
     */
    public void setHm_lg_ampm(java.lang.String hm_lg_ampm) {
        this.hm_lg_ampm = hm_lg_ampm;
    }


    /**
     * Gets the home_ampm value for this Game.
     * 
     * @return home_ampm
     */
    public java.lang.String getHome_ampm() {
        return home_ampm;
    }


    /**
     * Sets the home_ampm value for this Game.
     * 
     * @param home_ampm
     */
    public void setHome_ampm(java.lang.String home_ampm) {
        this.home_ampm = home_ampm;
    }


    /**
     * Gets the home_code value for this Game.
     * 
     * @return home_code
     */
    public java.lang.String getHome_code() {
        return home_code;
    }


    /**
     * Sets the home_code value for this Game.
     * 
     * @param home_code
     */
    public void setHome_code(java.lang.String home_code) {
        this.home_code = home_code;
    }


    /**
     * Gets the home_division value for this Game.
     * 
     * @return home_division
     */
    public java.lang.String getHome_division() {
        return home_division;
    }


    /**
     * Sets the home_division value for this Game.
     * 
     * @param home_division
     */
    public void setHome_division(java.lang.String home_division) {
        this.home_division = home_division;
    }


    /**
     * Gets the home_file_code value for this Game.
     * 
     * @return home_file_code
     */
    public java.lang.String getHome_file_code() {
        return home_file_code;
    }


    /**
     * Sets the home_file_code value for this Game.
     * 
     * @param home_file_code
     */
    public void setHome_file_code(java.lang.String home_file_code) {
        this.home_file_code = home_file_code;
    }


    /**
     * Gets the home_league_id value for this Game.
     * 
     * @return home_league_id
     */
    public java.lang.String getHome_league_id() {
        return home_league_id;
    }


    /**
     * Sets the home_league_id value for this Game.
     * 
     * @param home_league_id
     */
    public void setHome_league_id(java.lang.String home_league_id) {
        this.home_league_id = home_league_id;
    }


    /**
     * Gets the home_loss value for this Game.
     * 
     * @return home_loss
     */
    public java.lang.String getHome_loss() {
        return home_loss;
    }


    /**
     * Sets the home_loss value for this Game.
     * 
     * @param home_loss
     */
    public void setHome_loss(java.lang.String home_loss) {
        this.home_loss = home_loss;
    }


    /**
     * Gets the home_name_abbrev value for this Game.
     * 
     * @return home_name_abbrev
     */
    public java.lang.String getHome_name_abbrev() {
        return home_name_abbrev;
    }


    /**
     * Sets the home_name_abbrev value for this Game.
     * 
     * @param home_name_abbrev
     */
    public void setHome_name_abbrev(java.lang.String home_name_abbrev) {
        this.home_name_abbrev = home_name_abbrev;
    }


    /**
     * Gets the home_sport_code value for this Game.
     * 
     * @return home_sport_code
     */
    public java.lang.String getHome_sport_code() {
        return home_sport_code;
    }


    /**
     * Sets the home_sport_code value for this Game.
     * 
     * @param home_sport_code
     */
    public void setHome_sport_code(java.lang.String home_sport_code) {
        this.home_sport_code = home_sport_code;
    }


    /**
     * Gets the home_team_city value for this Game.
     * 
     * @return home_team_city
     */
    public java.lang.String getHome_team_city() {
        return home_team_city;
    }


    /**
     * Sets the home_team_city value for this Game.
     * 
     * @param home_team_city
     */
    public void setHome_team_city(java.lang.String home_team_city) {
        this.home_team_city = home_team_city;
    }


    /**
     * Gets the home_team_errors value for this Game.
     * 
     * @return home_team_errors
     */
    public java.lang.String getHome_team_errors() {
        return home_team_errors;
    }


    /**
     * Sets the home_team_errors value for this Game.
     * 
     * @param home_team_errors
     */
    public void setHome_team_errors(java.lang.String home_team_errors) {
        this.home_team_errors = home_team_errors;
    }


    /**
     * Gets the home_team_hits value for this Game.
     * 
     * @return home_team_hits
     */
    public java.lang.String getHome_team_hits() {
        return home_team_hits;
    }


    /**
     * Sets the home_team_hits value for this Game.
     * 
     * @param home_team_hits
     */
    public void setHome_team_hits(java.lang.String home_team_hits) {
        this.home_team_hits = home_team_hits;
    }


    /**
     * Gets the home_team_id value for this Game.
     * 
     * @return home_team_id
     */
    public java.lang.String getHome_team_id() {
        return home_team_id;
    }


    /**
     * Sets the home_team_id value for this Game.
     * 
     * @param home_team_id
     */
    public void setHome_team_id(java.lang.String home_team_id) {
        this.home_team_id = home_team_id;
    }


    /**
     * Gets the home_team_link value for this Game.
     * 
     * @return home_team_link
     */
    public java.lang.String getHome_team_link() {
        return home_team_link;
    }


    /**
     * Sets the home_team_link value for this Game.
     * 
     * @param home_team_link
     */
    public void setHome_team_link(java.lang.String home_team_link) {
        this.home_team_link = home_team_link;
    }


    /**
     * Gets the home_team_name value for this Game.
     * 
     * @return home_team_name
     */
    public java.lang.String getHome_team_name() {
        return home_team_name;
    }


    /**
     * Sets the home_team_name value for this Game.
     * 
     * @param home_team_name
     */
    public void setHome_team_name(java.lang.String home_team_name) {
        this.home_team_name = home_team_name;
    }


    /**
     * Gets the home_team_runs value for this Game.
     * 
     * @return home_team_runs
     */
    public java.lang.String getHome_team_runs() {
        return home_team_runs;
    }


    /**
     * Sets the home_team_runs value for this Game.
     * 
     * @param home_team_runs
     */
    public void setHome_team_runs(java.lang.String home_team_runs) {
        this.home_team_runs = home_team_runs;
    }


    /**
     * Gets the home_time value for this Game.
     * 
     * @return home_time
     */
    public java.lang.String getHome_time() {
        return home_time;
    }


    /**
     * Sets the home_time value for this Game.
     * 
     * @param home_time
     */
    public void setHome_time(java.lang.String home_time) {
        this.home_time = home_time;
    }


    /**
     * Gets the home_time_zone value for this Game.
     * 
     * @return home_time_zone
     */
    public java.lang.String getHome_time_zone() {
        return home_time_zone;
    }


    /**
     * Sets the home_time_zone value for this Game.
     * 
     * @param home_time_zone
     */
    public void setHome_time_zone(java.lang.String home_time_zone) {
        this.home_time_zone = home_time_zone;
    }


    /**
     * Gets the home_win value for this Game.
     * 
     * @return home_win
     */
    public java.lang.String getHome_win() {
        return home_win;
    }


    /**
     * Sets the home_win value for this Game.
     * 
     * @param home_win
     */
    public void setHome_win(java.lang.String home_win) {
        this.home_win = home_win;
    }


    /**
     * Gets the id value for this Game.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Game.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ind value for this Game.
     * 
     * @return ind
     */
    public java.lang.String getInd() {
        return ind;
    }


    /**
     * Sets the ind value for this Game.
     * 
     * @param ind
     */
    public void setInd(java.lang.String ind) {
        this.ind = ind;
    }


    /**
     * Gets the inning value for this Game.
     * 
     * @return inning
     */
    public java.lang.String getInning() {
        return inning;
    }


    /**
     * Sets the inning value for this Game.
     * 
     * @param inning
     */
    public void setInning(java.lang.String inning) {
        this.inning = inning;
    }


    /**
     * Gets the league value for this Game.
     * 
     * @return league
     */
    public java.lang.String getLeague() {
        return league;
    }


    /**
     * Sets the league value for this Game.
     * 
     * @param league
     */
    public void setLeague(java.lang.String league) {
        this.league = league;
    }


    /**
     * Gets the outs value for this Game.
     * 
     * @return outs
     */
    public java.lang.String getOuts() {
        return outs;
    }


    /**
     * Sets the outs value for this Game.
     * 
     * @param outs
     */
    public void setOuts(java.lang.String outs) {
        this.outs = outs;
    }


    /**
     * Gets the runner_on_base_status value for this Game.
     * 
     * @return runner_on_base_status
     */
    public java.lang.String getRunner_on_base_status() {
        return runner_on_base_status;
    }


    /**
     * Sets the runner_on_base_status value for this Game.
     * 
     * @param runner_on_base_status
     */
    public void setRunner_on_base_status(java.lang.String runner_on_base_status) {
        this.runner_on_base_status = runner_on_base_status;
    }


    /**
     * Gets the scheduled_innings value for this Game.
     * 
     * @return scheduled_innings
     */
    public java.lang.String getScheduled_innings() {
        return scheduled_innings;
    }


    /**
     * Sets the scheduled_innings value for this Game.
     * 
     * @param scheduled_innings
     */
    public void setScheduled_innings(java.lang.String scheduled_innings) {
        this.scheduled_innings = scheduled_innings;
    }


    /**
     * Gets the status value for this Game.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Game.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the time value for this Game.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this Game.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the time_aw_lg value for this Game.
     * 
     * @return time_aw_lg
     */
    public java.lang.String getTime_aw_lg() {
        return time_aw_lg;
    }


    /**
     * Sets the time_aw_lg value for this Game.
     * 
     * @param time_aw_lg
     */
    public void setTime_aw_lg(java.lang.String time_aw_lg) {
        this.time_aw_lg = time_aw_lg;
    }


    /**
     * Gets the time_hm_lg value for this Game.
     * 
     * @return time_hm_lg
     */
    public java.lang.String getTime_hm_lg() {
        return time_hm_lg;
    }


    /**
     * Sets the time_hm_lg value for this Game.
     * 
     * @param time_hm_lg
     */
    public void setTime_hm_lg(java.lang.String time_hm_lg) {
        this.time_hm_lg = time_hm_lg;
    }


    /**
     * Gets the time_zone value for this Game.
     * 
     * @return time_zone
     */
    public java.lang.String getTime_zone() {
        return time_zone;
    }


    /**
     * Sets the time_zone value for this Game.
     * 
     * @param time_zone
     */
    public void setTime_zone(java.lang.String time_zone) {
        this.time_zone = time_zone;
    }


    /**
     * Gets the time_zone_aw_lg value for this Game.
     * 
     * @return time_zone_aw_lg
     */
    public java.lang.String getTime_zone_aw_lg() {
        return time_zone_aw_lg;
    }


    /**
     * Sets the time_zone_aw_lg value for this Game.
     * 
     * @param time_zone_aw_lg
     */
    public void setTime_zone_aw_lg(java.lang.String time_zone_aw_lg) {
        this.time_zone_aw_lg = time_zone_aw_lg;
    }


    /**
     * Gets the time_zone_hm_lg value for this Game.
     * 
     * @return time_zone_hm_lg
     */
    public java.lang.String getTime_zone_hm_lg() {
        return time_zone_hm_lg;
    }


    /**
     * Sets the time_zone_hm_lg value for this Game.
     * 
     * @param time_zone_hm_lg
     */
    public void setTime_zone_hm_lg(java.lang.String time_zone_hm_lg) {
        this.time_zone_hm_lg = time_zone_hm_lg;
    }


    /**
     * Gets the top_inning value for this Game.
     * 
     * @return top_inning
     */
    public java.lang.String getTop_inning() {
        return top_inning;
    }


    /**
     * Sets the top_inning value for this Game.
     * 
     * @param top_inning
     */
    public void setTop_inning(java.lang.String top_inning) {
        this.top_inning = top_inning;
    }


    /**
     * Gets the tz_aw_lg_gen value for this Game.
     * 
     * @return tz_aw_lg_gen
     */
    public java.lang.String getTz_aw_lg_gen() {
        return tz_aw_lg_gen;
    }


    /**
     * Sets the tz_aw_lg_gen value for this Game.
     * 
     * @param tz_aw_lg_gen
     */
    public void setTz_aw_lg_gen(java.lang.String tz_aw_lg_gen) {
        this.tz_aw_lg_gen = tz_aw_lg_gen;
    }


    /**
     * Gets the tz_hm_lg_gen value for this Game.
     * 
     * @return tz_hm_lg_gen
     */
    public java.lang.String getTz_hm_lg_gen() {
        return tz_hm_lg_gen;
    }


    /**
     * Sets the tz_hm_lg_gen value for this Game.
     * 
     * @param tz_hm_lg_gen
     */
    public void setTz_hm_lg_gen(java.lang.String tz_hm_lg_gen) {
        this.tz_hm_lg_gen = tz_hm_lg_gen;
    }


    /**
     * Gets the venue value for this Game.
     * 
     * @return venue
     */
    public java.lang.String getVenue() {
        return venue;
    }


    /**
     * Sets the venue value for this Game.
     * 
     * @param venue
     */
    public void setVenue(java.lang.String venue) {
        this.venue = venue;
    }


    /**
     * Gets the venue_id value for this Game.
     * 
     * @return venue_id
     */
    public java.lang.String getVenue_id() {
        return venue_id;
    }


    /**
     * Sets the venue_id value for this Game.
     * 
     * @param venue_id
     */
    public void setVenue_id(java.lang.String venue_id) {
        this.venue_id = venue_id;
    }


    /**
     * Gets the venue_w_chan_loc value for this Game.
     * 
     * @return venue_w_chan_loc
     */
    public java.lang.String getVenue_w_chan_loc() {
        return venue_w_chan_loc;
    }


    /**
     * Sets the venue_w_chan_loc value for this Game.
     * 
     * @param venue_w_chan_loc
     */
    public void setVenue_w_chan_loc(java.lang.String venue_w_chan_loc) {
        this.venue_w_chan_loc = venue_w_chan_loc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Game)) return false;
        Game other = (Game) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ampm==null && other.getAmpm()==null) || 
             (this.ampm!=null &&
              this.ampm.equals(other.getAmpm()))) &&
            ((this.aw_lg_ampm==null && other.getAw_lg_ampm()==null) || 
             (this.aw_lg_ampm!=null &&
              this.aw_lg_ampm.equals(other.getAw_lg_ampm()))) &&
            ((this.away_ampm==null && other.getAway_ampm()==null) || 
             (this.away_ampm!=null &&
              this.away_ampm.equals(other.getAway_ampm()))) &&
            ((this.away_code==null && other.getAway_code()==null) || 
             (this.away_code!=null &&
              this.away_code.equals(other.getAway_code()))) &&
            ((this.away_division==null && other.getAway_division()==null) || 
             (this.away_division!=null &&
              this.away_division.equals(other.getAway_division()))) &&
            ((this.away_file_code==null && other.getAway_file_code()==null) || 
             (this.away_file_code!=null &&
              this.away_file_code.equals(other.getAway_file_code()))) &&
            ((this.away_league_id==null && other.getAway_league_id()==null) || 
             (this.away_league_id!=null &&
              this.away_league_id.equals(other.getAway_league_id()))) &&
            ((this.away_loss==null && other.getAway_loss()==null) || 
             (this.away_loss!=null &&
              this.away_loss.equals(other.getAway_loss()))) &&
            ((this.away_name_abbrev==null && other.getAway_name_abbrev()==null) || 
             (this.away_name_abbrev!=null &&
              this.away_name_abbrev.equals(other.getAway_name_abbrev()))) &&
            ((this.away_sport_code==null && other.getAway_sport_code()==null) || 
             (this.away_sport_code!=null &&
              this.away_sport_code.equals(other.getAway_sport_code()))) &&
            ((this.away_team_city==null && other.getAway_team_city()==null) || 
             (this.away_team_city!=null &&
              this.away_team_city.equals(other.getAway_team_city()))) &&
            ((this.away_team_errors==null && other.getAway_team_errors()==null) || 
             (this.away_team_errors!=null &&
              this.away_team_errors.equals(other.getAway_team_errors()))) &&
            ((this.away_team_hits==null && other.getAway_team_hits()==null) || 
             (this.away_team_hits!=null &&
              this.away_team_hits.equals(other.getAway_team_hits()))) &&
            ((this.away_team_id==null && other.getAway_team_id()==null) || 
             (this.away_team_id!=null &&
              this.away_team_id.equals(other.getAway_team_id()))) &&
            ((this.away_team_link==null && other.getAway_team_link()==null) || 
             (this.away_team_link!=null &&
              this.away_team_link.equals(other.getAway_team_link()))) &&
            ((this.away_team_name==null && other.getAway_team_name()==null) || 
             (this.away_team_name!=null &&
              this.away_team_name.equals(other.getAway_team_name()))) &&
            ((this.away_team_runs==null && other.getAway_team_runs()==null) || 
             (this.away_team_runs!=null &&
              this.away_team_runs.equals(other.getAway_team_runs()))) &&
            ((this.away_time==null && other.getAway_time()==null) || 
             (this.away_time!=null &&
              this.away_time.equals(other.getAway_time()))) &&
            ((this.away_time_zone==null && other.getAway_time_zone()==null) || 
             (this.away_time_zone!=null &&
              this.away_time_zone.equals(other.getAway_time_zone()))) &&
            ((this.away_win==null && other.getAway_win()==null) || 
             (this.away_win!=null &&
              this.away_win.equals(other.getAway_win()))) &&
            ((this.box_link==null && other.getBox_link()==null) || 
             (this.box_link!=null &&
              this.box_link.equals(other.getBox_link()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            this.game_pk == other.getGame_pk() &&
            ((this.game_type==null && other.getGame_type()==null) || 
             (this.game_type!=null &&
              this.game_type.equals(other.getGame_type()))) &&
            ((this.gameday_link==null && other.getGameday_link()==null) || 
             (this.gameday_link!=null &&
              this.gameday_link.equals(other.getGameday_link()))) &&
            ((this.gameday_sw==null && other.getGameday_sw()==null) || 
             (this.gameday_sw!=null &&
              this.gameday_sw.equals(other.getGameday_sw()))) &&
            ((this.hm_lg_ampm==null && other.getHm_lg_ampm()==null) || 
             (this.hm_lg_ampm!=null &&
              this.hm_lg_ampm.equals(other.getHm_lg_ampm()))) &&
            ((this.home_ampm==null && other.getHome_ampm()==null) || 
             (this.home_ampm!=null &&
              this.home_ampm.equals(other.getHome_ampm()))) &&
            ((this.home_code==null && other.getHome_code()==null) || 
             (this.home_code!=null &&
              this.home_code.equals(other.getHome_code()))) &&
            ((this.home_division==null && other.getHome_division()==null) || 
             (this.home_division!=null &&
              this.home_division.equals(other.getHome_division()))) &&
            ((this.home_file_code==null && other.getHome_file_code()==null) || 
             (this.home_file_code!=null &&
              this.home_file_code.equals(other.getHome_file_code()))) &&
            ((this.home_league_id==null && other.getHome_league_id()==null) || 
             (this.home_league_id!=null &&
              this.home_league_id.equals(other.getHome_league_id()))) &&
            ((this.home_loss==null && other.getHome_loss()==null) || 
             (this.home_loss!=null &&
              this.home_loss.equals(other.getHome_loss()))) &&
            ((this.home_name_abbrev==null && other.getHome_name_abbrev()==null) || 
             (this.home_name_abbrev!=null &&
              this.home_name_abbrev.equals(other.getHome_name_abbrev()))) &&
            ((this.home_sport_code==null && other.getHome_sport_code()==null) || 
             (this.home_sport_code!=null &&
              this.home_sport_code.equals(other.getHome_sport_code()))) &&
            ((this.home_team_city==null && other.getHome_team_city()==null) || 
             (this.home_team_city!=null &&
              this.home_team_city.equals(other.getHome_team_city()))) &&
            ((this.home_team_errors==null && other.getHome_team_errors()==null) || 
             (this.home_team_errors!=null &&
              this.home_team_errors.equals(other.getHome_team_errors()))) &&
            ((this.home_team_hits==null && other.getHome_team_hits()==null) || 
             (this.home_team_hits!=null &&
              this.home_team_hits.equals(other.getHome_team_hits()))) &&
            ((this.home_team_id==null && other.getHome_team_id()==null) || 
             (this.home_team_id!=null &&
              this.home_team_id.equals(other.getHome_team_id()))) &&
            ((this.home_team_link==null && other.getHome_team_link()==null) || 
             (this.home_team_link!=null &&
              this.home_team_link.equals(other.getHome_team_link()))) &&
            ((this.home_team_name==null && other.getHome_team_name()==null) || 
             (this.home_team_name!=null &&
              this.home_team_name.equals(other.getHome_team_name()))) &&
            ((this.home_team_runs==null && other.getHome_team_runs()==null) || 
             (this.home_team_runs!=null &&
              this.home_team_runs.equals(other.getHome_team_runs()))) &&
            ((this.home_time==null && other.getHome_time()==null) || 
             (this.home_time!=null &&
              this.home_time.equals(other.getHome_time()))) &&
            ((this.home_time_zone==null && other.getHome_time_zone()==null) || 
             (this.home_time_zone!=null &&
              this.home_time_zone.equals(other.getHome_time_zone()))) &&
            ((this.home_win==null && other.getHome_win()==null) || 
             (this.home_win!=null &&
              this.home_win.equals(other.getHome_win()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ind==null && other.getInd()==null) || 
             (this.ind!=null &&
              this.ind.equals(other.getInd()))) &&
            ((this.inning==null && other.getInning()==null) || 
             (this.inning!=null &&
              this.inning.equals(other.getInning()))) &&
            ((this.league==null && other.getLeague()==null) || 
             (this.league!=null &&
              this.league.equals(other.getLeague()))) &&
            ((this.outs==null && other.getOuts()==null) || 
             (this.outs!=null &&
              this.outs.equals(other.getOuts()))) &&
            ((this.runner_on_base_status==null && other.getRunner_on_base_status()==null) || 
             (this.runner_on_base_status!=null &&
              this.runner_on_base_status.equals(other.getRunner_on_base_status()))) &&
            ((this.scheduled_innings==null && other.getScheduled_innings()==null) || 
             (this.scheduled_innings!=null &&
              this.scheduled_innings.equals(other.getScheduled_innings()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.time_aw_lg==null && other.getTime_aw_lg()==null) || 
             (this.time_aw_lg!=null &&
              this.time_aw_lg.equals(other.getTime_aw_lg()))) &&
            ((this.time_hm_lg==null && other.getTime_hm_lg()==null) || 
             (this.time_hm_lg!=null &&
              this.time_hm_lg.equals(other.getTime_hm_lg()))) &&
            ((this.time_zone==null && other.getTime_zone()==null) || 
             (this.time_zone!=null &&
              this.time_zone.equals(other.getTime_zone()))) &&
            ((this.time_zone_aw_lg==null && other.getTime_zone_aw_lg()==null) || 
             (this.time_zone_aw_lg!=null &&
              this.time_zone_aw_lg.equals(other.getTime_zone_aw_lg()))) &&
            ((this.time_zone_hm_lg==null && other.getTime_zone_hm_lg()==null) || 
             (this.time_zone_hm_lg!=null &&
              this.time_zone_hm_lg.equals(other.getTime_zone_hm_lg()))) &&
            ((this.top_inning==null && other.getTop_inning()==null) || 
             (this.top_inning!=null &&
              this.top_inning.equals(other.getTop_inning()))) &&
            ((this.tz_aw_lg_gen==null && other.getTz_aw_lg_gen()==null) || 
             (this.tz_aw_lg_gen!=null &&
              this.tz_aw_lg_gen.equals(other.getTz_aw_lg_gen()))) &&
            ((this.tz_hm_lg_gen==null && other.getTz_hm_lg_gen()==null) || 
             (this.tz_hm_lg_gen!=null &&
              this.tz_hm_lg_gen.equals(other.getTz_hm_lg_gen()))) &&
            ((this.venue==null && other.getVenue()==null) || 
             (this.venue!=null &&
              this.venue.equals(other.getVenue()))) &&
            ((this.venue_id==null && other.getVenue_id()==null) || 
             (this.venue_id!=null &&
              this.venue_id.equals(other.getVenue_id()))) &&
            ((this.venue_w_chan_loc==null && other.getVenue_w_chan_loc()==null) || 
             (this.venue_w_chan_loc!=null &&
              this.venue_w_chan_loc.equals(other.getVenue_w_chan_loc())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmpm() != null) {
            _hashCode += getAmpm().hashCode();
        }
        if (getAw_lg_ampm() != null) {
            _hashCode += getAw_lg_ampm().hashCode();
        }
        if (getAway_ampm() != null) {
            _hashCode += getAway_ampm().hashCode();
        }
        if (getAway_code() != null) {
            _hashCode += getAway_code().hashCode();
        }
        if (getAway_division() != null) {
            _hashCode += getAway_division().hashCode();
        }
        if (getAway_file_code() != null) {
            _hashCode += getAway_file_code().hashCode();
        }
        if (getAway_league_id() != null) {
            _hashCode += getAway_league_id().hashCode();
        }
        if (getAway_loss() != null) {
            _hashCode += getAway_loss().hashCode();
        }
        if (getAway_name_abbrev() != null) {
            _hashCode += getAway_name_abbrev().hashCode();
        }
        if (getAway_sport_code() != null) {
            _hashCode += getAway_sport_code().hashCode();
        }
        if (getAway_team_city() != null) {
            _hashCode += getAway_team_city().hashCode();
        }
        if (getAway_team_errors() != null) {
            _hashCode += getAway_team_errors().hashCode();
        }
        if (getAway_team_hits() != null) {
            _hashCode += getAway_team_hits().hashCode();
        }
        if (getAway_team_id() != null) {
            _hashCode += getAway_team_id().hashCode();
        }
        if (getAway_team_link() != null) {
            _hashCode += getAway_team_link().hashCode();
        }
        if (getAway_team_name() != null) {
            _hashCode += getAway_team_name().hashCode();
        }
        if (getAway_team_runs() != null) {
            _hashCode += getAway_team_runs().hashCode();
        }
        if (getAway_time() != null) {
            _hashCode += getAway_time().hashCode();
        }
        if (getAway_time_zone() != null) {
            _hashCode += getAway_time_zone().hashCode();
        }
        if (getAway_win() != null) {
            _hashCode += getAway_win().hashCode();
        }
        if (getBox_link() != null) {
            _hashCode += getBox_link().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        _hashCode += getGame_pk();
        if (getGame_type() != null) {
            _hashCode += getGame_type().hashCode();
        }
        if (getGameday_link() != null) {
            _hashCode += getGameday_link().hashCode();
        }
        if (getGameday_sw() != null) {
            _hashCode += getGameday_sw().hashCode();
        }
        if (getHm_lg_ampm() != null) {
            _hashCode += getHm_lg_ampm().hashCode();
        }
        if (getHome_ampm() != null) {
            _hashCode += getHome_ampm().hashCode();
        }
        if (getHome_code() != null) {
            _hashCode += getHome_code().hashCode();
        }
        if (getHome_division() != null) {
            _hashCode += getHome_division().hashCode();
        }
        if (getHome_file_code() != null) {
            _hashCode += getHome_file_code().hashCode();
        }
        if (getHome_league_id() != null) {
            _hashCode += getHome_league_id().hashCode();
        }
        if (getHome_loss() != null) {
            _hashCode += getHome_loss().hashCode();
        }
        if (getHome_name_abbrev() != null) {
            _hashCode += getHome_name_abbrev().hashCode();
        }
        if (getHome_sport_code() != null) {
            _hashCode += getHome_sport_code().hashCode();
        }
        if (getHome_team_city() != null) {
            _hashCode += getHome_team_city().hashCode();
        }
        if (getHome_team_errors() != null) {
            _hashCode += getHome_team_errors().hashCode();
        }
        if (getHome_team_hits() != null) {
            _hashCode += getHome_team_hits().hashCode();
        }
        if (getHome_team_id() != null) {
            _hashCode += getHome_team_id().hashCode();
        }
        if (getHome_team_link() != null) {
            _hashCode += getHome_team_link().hashCode();
        }
        if (getHome_team_name() != null) {
            _hashCode += getHome_team_name().hashCode();
        }
        if (getHome_team_runs() != null) {
            _hashCode += getHome_team_runs().hashCode();
        }
        if (getHome_time() != null) {
            _hashCode += getHome_time().hashCode();
        }
        if (getHome_time_zone() != null) {
            _hashCode += getHome_time_zone().hashCode();
        }
        if (getHome_win() != null) {
            _hashCode += getHome_win().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInd() != null) {
            _hashCode += getInd().hashCode();
        }
        if (getInning() != null) {
            _hashCode += getInning().hashCode();
        }
        if (getLeague() != null) {
            _hashCode += getLeague().hashCode();
        }
        if (getOuts() != null) {
            _hashCode += getOuts().hashCode();
        }
        if (getRunner_on_base_status() != null) {
            _hashCode += getRunner_on_base_status().hashCode();
        }
        if (getScheduled_innings() != null) {
            _hashCode += getScheduled_innings().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTime_aw_lg() != null) {
            _hashCode += getTime_aw_lg().hashCode();
        }
        if (getTime_hm_lg() != null) {
            _hashCode += getTime_hm_lg().hashCode();
        }
        if (getTime_zone() != null) {
            _hashCode += getTime_zone().hashCode();
        }
        if (getTime_zone_aw_lg() != null) {
            _hashCode += getTime_zone_aw_lg().hashCode();
        }
        if (getTime_zone_hm_lg() != null) {
            _hashCode += getTime_zone_hm_lg().hashCode();
        }
        if (getTop_inning() != null) {
            _hashCode += getTop_inning().hashCode();
        }
        if (getTz_aw_lg_gen() != null) {
            _hashCode += getTz_aw_lg_gen().hashCode();
        }
        if (getTz_hm_lg_gen() != null) {
            _hashCode += getTz_hm_lg_gen().hashCode();
        }
        if (getVenue() != null) {
            _hashCode += getVenue().hashCode();
        }
        if (getVenue_id() != null) {
            _hashCode += getVenue_id().hashCode();
        }
        if (getVenue_w_chan_loc() != null) {
            _hashCode += getVenue_w_chan_loc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Game.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scoreboard.delunasaenz.com/", "game"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aw_lg_ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aw_lg_ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_division");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_file_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_file_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_league_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_league_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_loss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_loss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_name_abbrev");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_name_abbrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_sport_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_sport_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_team_runs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_team_runs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away_win");
        elemField.setXmlName(new javax.xml.namespace.QName("", "away_win"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("box_link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "box_link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("game_pk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "game_pk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("game_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "game_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gameday_link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gameday_link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gameday_sw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gameday_sw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hm_lg_ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hm_lg_ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_ampm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_ampm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_division");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_file_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_file_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_league_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_league_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_loss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_loss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_name_abbrev");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_name_abbrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_sport_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_sport_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_team_runs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_team_runs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_win");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_win"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("league");
        elemField.setXmlName(new javax.xml.namespace.QName("", "league"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runner_on_base_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runner_on_base_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduled_innings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduled_innings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_aw_lg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_aw_lg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_hm_lg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_hm_lg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_zone_aw_lg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone_aw_lg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_zone_hm_lg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone_hm_lg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top_inning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top_inning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tz_aw_lg_gen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tz_aw_lg_gen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tz_hm_lg_gen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tz_hm_lg_gen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "venue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venue_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "venue_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venue_w_chan_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "venue_w_chan_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
