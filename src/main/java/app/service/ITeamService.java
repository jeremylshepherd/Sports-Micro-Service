package app.service;

import app.dao.ITeamDAO;
import app.model.Team;

import java.util.List;

public interface ITeamService {
    public List<Team> fetchAllTeams();
}
