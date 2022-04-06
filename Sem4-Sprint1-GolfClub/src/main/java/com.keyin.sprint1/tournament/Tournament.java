package com.keyin.sprint1.tournament;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Tournament {

    @Id
    @SequenceGenerator(
            name = "tournament_sequence",
            sequenceName = "tournament_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tournament_sequence"
    )

    private int TournamentId;
    private LocalDate TournamentStartDate;
    private LocalDate TournamentEndDate;
    private String TournamentLocation;
    private double TournamentEntryFee;
    private double CashPrizeAmount;
    private String TournamentParticipants;
    private String FinalStandings;

    public Tournament() {
    }

    public Tournament(int tournamentId,
                      LocalDate tournamentStartDate,
                      LocalDate tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        TournamentId = tournamentId;
        TournamentStartDate = tournamentStartDate;
        TournamentEndDate = tournamentEndDate;
        TournamentLocation = tournamentLocation;
        TournamentEntryFee = tournamentEntryFee;
        CashPrizeAmount = cashPrizeAmount;
        TournamentParticipants = tournamentParticipants;
        FinalStandings = finalStandings;
    }

    public Tournament(LocalDate tournamentStartDate,
                      LocalDate tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        TournamentStartDate = tournamentStartDate;
        TournamentEndDate = tournamentEndDate;
        TournamentLocation = tournamentLocation;
        TournamentEntryFee = tournamentEntryFee;
        CashPrizeAmount = cashPrizeAmount;
        TournamentParticipants = tournamentParticipants;
        FinalStandings = finalStandings;
    }

    public int getTournamentId() {
        return TournamentId;
    }

    public void setTournamentId(int tournamentId) {
        TournamentId = tournamentId;
    }

    public LocalDate getTournamentStartDate() {
        return TournamentStartDate;
    }

    public void setTournamentStartDate(LocalDate tournamentStartDate) {
        TournamentStartDate = tournamentStartDate;
    }

    public LocalDate getTournamentEndDate() {
        return TournamentEndDate;
    }

    public void setTournamentEndDate(LocalDate tournamentEndDate) {
        TournamentEndDate = tournamentEndDate;
    }

    public String getTournamentLocation() {
        return TournamentLocation;
    }

    public void setTournamentLocation(String tournamentLocation) {
        TournamentLocation = tournamentLocation;
    }

    public double getTournamentEntryFee() {
        return TournamentEntryFee;
    }

    public void setTournamentEntryFee(double tournamentEntryFee) {
        TournamentEntryFee = tournamentEntryFee;
    }

    public double getCashPrizeAmount() {
        return CashPrizeAmount;
    }

    public void setCashPrizeAmount(double cashPrizeAmount) {
        CashPrizeAmount = cashPrizeAmount;
    }

    public String getTournamentParticipants() {
        return TournamentParticipants;
    }

    public void setTournamentParticipants(String tournamentParticipants) {
        TournamentParticipants = tournamentParticipants;
    }

    public String getFinalStandings() {
        return FinalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        FinalStandings = finalStandings;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "Tournament Id=" + TournamentId +
                ", Tournament Start Date='" + TournamentStartDate + '\'' +
                ", Tournament End Date='" + TournamentEndDate + '\'' +
                ", Tournament Location='" + TournamentLocation + '\'' +
                ", Tournament Entry Fee=" + "$" + TournamentEntryFee +
                ", Cash Prize Amount=" + "$" + CashPrizeAmount +
                ", Tournament Participants='" + TournamentParticipants + '\'' +
                ", Final Standings='" + FinalStandings + '\'' +
                '}';
    }
}

